package pl.library.statuschecking.jpa;
import pl.library.statuschecking.jpa.KategoriaRepository;
import pl.library.statuschecking.jpa.AutorRepository;

import pl.library.statuschecking.jpa.fillingData.FillingAutor;
import pl.library.statuschecking.jpa.fillingData.FillingKategoria;
import pl.library.statuschecking.jpa.fillingData.FillingKsiazka;
import pl.library.statuschecking.jpa.fillingData.FillingWydawnictwo;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        //UTWORZENIE OBIEKTÓW KLAS
        AutorRepository arepo = new AutorRepository();
        KategoriaRepository krepo = new KategoriaRepository();
        WydawnictwoRepository wrepo = new WydawnictwoRepository();
        KsiazkaRepository ksiazkaRepository = new KsiazkaRepository();

        //WYPEŁNIENIE ENCJI
        FillingAutor fillingAutor = new FillingAutor();
        FillingKategoria fillingKategoria = new FillingKategoria();
        FillingWydawnictwo fillingWydawnictwo = new FillingWydawnictwo();
        FillingKsiazka fillingKsiazka = new FillingKsiazka();

        //EKRAN POWITALNY
        System.out.println("Witaj w naszej bibliotece!");
        System.out.println("Co chcesz zrobić?");
        System.out.println("[Wyszukaj]   [Aktualizuj dane]   [Dodaj pozycję]   [Usuń pozycję]");

        //Testy ksiazka

//        Autor autor = arepo.findById(5);
//        Kategoria kategoria = krepo.findById(1);
//        Wydawnictwo wydawnictwo = wrepo.findById(3);
//        ksiazkaRepository.createKsiazka(2007,"Emma",autor,kategoria,wydawnictwo);
        //ksiazkaRepository.createKsiazka(rokProdukcji, tytul, autor, kategoria, wydawnictwo);



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
