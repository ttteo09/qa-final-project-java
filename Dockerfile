# Pasul 1: Luăm "mașina" gata echipată cu Java 17 și Maven
FROM maven:3.8.4-openjdk-17

# Pasul 2: Creăm un folder de lucru în interiorul mașinii
WORKDIR /app

# Pasul 3: Copiem fișierul pom.xml (lista de ingrediente)
COPY pom.xml .

# Pasul 4: Copiem tot restul proiectului (cod, config, teste)
COPY . .

# Pasul 5: Spunem ce să facă mașina când pornește: să ruleze testele
CMD ["mvn", "test"]