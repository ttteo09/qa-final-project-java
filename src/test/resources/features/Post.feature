# language: ro
Functionalitate: Creare Postari pe Feed

  Scenariu: Adaugare postare noua fara simulari text
  Given utilizatorul este pe pagina de autentificare
  When utilizatorul introduce datele de conectare valide
  And utilizatorul creeaza o postare noua cu textul "Automatizare proiect final de 40 puncte"
  Then postarea trebuie sa fie vizibila pe feed