# Selenium WebDriver
E2E - Selenium WebDriver, Java, Eclipse, Google Chrome

## Scenariusz 1 - dodaj konto administratora do zaplecza Joomla
1. Uruchom stronę design.media.pl
2. Maksymaluzuj okno 
3. Przejdź do zaplecza (/administrator) 
4. Wprowadź "Użytkownik" i "Hasło" -> "Zaloguj"
5. Kliknij zakładkę "Użytkownicy" -> "Utwórz"
6. Wypełnij pola: Nazwa, Użytkownik, Hasło, Powtórz hasło, Przypisz do grup 
7. Wybierz z listy: Szalbon zaplecza, Język zalpecza, Język witryny, Edytor, Serwer pomocy
8. Kliknij przycisk "Zapisz i zamknij"
9. Wyloguj się z konta Super User
10. Zaloguj się na nowe konto -> wyloguj się z konta

> Kod [DodajAdministratora.java](src/tdabrowski/DodajAdministratora.java)

> Uruchomienie testu na [YouTube >>](https://www.youtube.com/watch?v=UZ1tcYBtD8o)

## Scenariusz 2 - dodaj wybrany produkt do koszyka w sklepie
1. Uruchom stronę adrem.jgora.pl
2. Maksymaluzuj okno 
3. Przejdź do zakładki "Księgarnia Karkonoska"
4. Wybierz kategorię "Książki"
5. Kliknij pozycję "Anatomia nadczłowieka"
6. Dodaj pozycje do koszyka 
7. Przejdź do koszyka
8. Przejdź do kasy

> Kod [DodajDoKoszyka.java](src/tdabrowski/DodajDoKoszyka.java)

> Uruchomienie testu na [YouTube >>](https://www.youtube.com/watch?v=AMExtSvrtV0)

## Scenariusz 3 - edytuj adres wysyłki w sklepie
1. Uruchom stronę adrem.jgora.pl
2. Maksymaluzuj okno
3. Kliknij przycisk "Zaloguj się"
4. Wypełnij pola "Użytkownik" i "Hasło"
5. Kliknij input submit "Zaloguj się" z formularza
6. Kliknij link "Edytuj" obok "Adres dostawy"
7. Zaktualizuj dane pól formularza: imię, nazwisko, nazwa firmy, ulica, nr, miasto, kod pocztowy
8. Kliknij input submit "Zapisz"
9. Wyloguj się

> Kod [EdytujAdresWysylki.java](src/tdabrowski/EdytujAdresWysylki.java)

> Uruchomienie testu na [YouTube >>](https://www.youtube.com/watch?v=nQIVwgkAVRU)

## Scenariusz 4 - szukanie i wydrukowanie wybranego przetargu 
1. Uruchom stronę www.sobotka.pl
2. Maksymaluzuj okno
3. W polu wyszukiwania wprowadź string "przetarg na działki w przemiłowie"
4. Kliknij przycisk wyszukiwania
5. Kliknij w artykuł "II przetarg na działki w Przemiłowie"
6. Kliknij ikonę z nazwą "Drukuj"

> Kod [SzukajPrzetargDrukuj.java](src/tdabrowski/SzukajPrzetargDrukuj.java)

> Uruchomienie testu na [YouTube >>](https://www.youtube.com/watch?v=oGe6JKygqVw)

## Scenariusz 5 - szukanie wydarzenia i przeglądanie galerii
1. Uruchom stronę www.sobotka.pl
2. Maksymaluzuj okno
3. Kliknij w link "Aktualności"
4. Kliknij w podmenu "Kultura i Nauka"
5. Kliknij w artykuł zawierający string "Centrum Kultury"
6. Rozpocznij przeglądanie galerii za pomocą pętli
7. Zamknij przeglądanie galerii

> Kod [SzukajWydarzenieGaleria.java](src/tdabrowski/SzukajWydarzenieGaleria.java)

> Uruchomienie testu na [YouTube >>](https://www.youtube.com/watch?v=ya_3__R9IZY)
