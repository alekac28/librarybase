package pl.library.statuschecking.jpa;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        AutorRepository arepo = new AutorRepository();

//        System.out.println("Tutaj jeszcze działa");

        System.out.println("Witaj w naszej bibliotece!");
        System.out.println("Co chcesz zrobić?");
        System.out.println("[Wyszukaj]   [Aktualizuj dane]   [Dodaj pozycję]   [Usuń pozycję]");


//        Dodawanie do bazy
        arepo.createNewAutor("Jan", "Kowalski");
        arepo.createNewAutor("Jacek","Stasiak");

//        Wyszukiwanie w bazie
        Autor autor = arepo.findById(2);

//        Aktualizacja bazy
        arepo.updateImie(autor, "Alozjy");

        System.out.println(autor.getId() + " " + autor.getImie() + " " + autor.getNazwisko());

//        Usuwanie z bazy:
//        arepo.delete(autor);


    }
}
