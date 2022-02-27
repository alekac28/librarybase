package pl.library.statuschecking.jpa;

import pl.library.statuschecking.jpa.fillingData.FillingAutor;
import pl.library.statuschecking.jpa.fillingData.FillingKategoria;
import pl.library.statuschecking.jpa.fillingData.FillingWydawnictwo;

import java.util.Scanner;

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
        System.out.println("[Wyszukaj autora - 1]   [Aktualizuj dane - 2]   [Dodaj pozycję - 3]   [Usuń pozycję - 4]");

        Scanner wyszukiwanie = new Scanner(System.in);
        int search = Integer.parseInt(wyszukiwanie.nextLine());

        switch(search) {
            case 1:
                System.out.println("Twój wybór: [Wyszukaj autora]");
                String searchBook = wyszukiwanie.nextLine();
                String[] autor = ksiazkaRepository.findByName(searchBook);
                //System.out.print("Ksiazka: "+searchBook+" Autor: "+autor[0] + " "+autor[1]);
                break;
            case 2:
                System.out.println("Twój wybór: [Aktualizuj dane]");
                System.out.println("Imię jakiego autora chcesz zmienić? Podaj ID.");
                Scanner scan = new Scanner(System.in);
                int searchAutor = scan.nextInt();
                Autor autor1 = arepo.findById(searchAutor);
                System.out.println("Podaj nowe imię Autora: ");
                String newName = wyszukiwanie.nextLine();
                arepo.updateImie(autor1, newName);
                break;
            case 3:
                System.out.println("Twój wybór: [Dodaj pozycję]");
                System.out.println("Jaką kategorię chcesz dodać?");
                String newCathegory = wyszukiwanie.nextLine();
                krepo.createNewCathegory(newCathegory);
                break;
            case 4:
                System.out.println("Twój wybór: [Usuń pozycję]");
                System.out.println("Podaj ID autora do usunięcia");
                Scanner scann = new Scanner(System.in);
                int findAutor = scann.nextInt();
                Autor autorr = arepo.findById(findAutor);
                arepo.delete(autorr);
                break;
            default:
                System.out.println("Brak opcji!");
        }





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
