# language: ro
Functionalitate: Vizualizare Profil Utilizator

  Scenariu: Verificare date profil utilizator
  Given utilizatorul este pe pagina de autentificare
  When utilizatorul introduce datele de conectare valide
  And utilizatorul acceseaza sectiunea profil
  Then emailul utilizatorului trebuie sa fie afisat corect