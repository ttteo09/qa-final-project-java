package com.qaschool.validators;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostValidatorTest {

    private PostValidator validator;

    @BeforeClass
    public void setup() {
        validator = new PostValidator();
    }

    @DataProvider(name = "postDataProvider")
    public Object[][] postData() {
        return new Object[][] {
                // Text, Status așteptat
                {"Aceasta este o postare normală.", "POST_VALID"},
                {null, "ERROR_EMPTY"},
                {"", "ERROR_EMPTY"},
                {"   ", "ERROR_EMPTY"},
                {"Nu discutăm despre politică aici.", "ERROR_FORBIDDEN"},
                {"POLITICĂ și știri.", "ERROR_FORBIDDEN"},
                {"A".repeat(251), "ERROR_TOO_LONG"}
        };
    }

    @Test(dataProvider = "postDataProvider")
    public void testPostValidation(String postBody, String expectedStatus) {
        String actualStatus = validator.getPostStatus(postBody);
        Assert.assertEquals(actualStatus, expectedStatus, "Statusul returnat nu este cel corect pentru textul: " + postBody);
    }
}