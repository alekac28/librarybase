package pl.library.statuschecking.jpa;
import pl.library.statuschecking.jpa.KategoriaRepository;
import pl.library.statuschecking.jpa.AutorRepository;

import pl.library.statuschecking.jpa.fillingData.FillingAutor;
import pl.library.statuschecking.jpa.fillingData.FillingKategoria;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        AutorRepository arepo = new AutorRepository();
        KategoriaRepository krepo = new KategoriaRepository();

        //WYPEŁNIENIE ENCJI
        FillingAutor fillingAutor = new FillingAutor();
        FillingKategoria fillingKategoria = new FillingKategoria();


//        System.out.println("Tutaj jeszcze działa");

        System.out.println("Witaj w naszej bibliotece!");
        System.out.println("Co chcesz zrobić?");
        System.out.println("[Wyszukaj]   [Aktualizuj dane]   [Dodaj pozycję]   [Usuń pozycję]");

//OPERACJE AUTOR
////        Wyszukiwanie w bazie
//        Autor autor = arepo.findById(2);
////        Aktualizacja bazy
//        arepo.updateImie(autor, "Alozjy");
//        System.out.println(autor.getId() + " " + autor.getImie() + " " + autor.getNazwisko());
//        Usuwanie z bazy:
//        arepo.delete(autor);


//OPERACJE KATEGORIA
//        KategoriaRepository krepo = new KategoriaRepository();
//        System.out.println("Dodawanie nowych kategorii:");
//        krepo.createNewCathegory("Romans");
//        Kategoria kategoria = krepo.findById(1);
//        krepo.updateKategoria(kategoria, "Fantastyka");


    }
}
