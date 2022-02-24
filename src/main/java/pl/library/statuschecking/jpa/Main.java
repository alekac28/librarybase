package pl.library.statuschecking.jpa;

public class Main {

    public static void main(String[] args){

        AutorRepository arepo = new AutorRepository();
        arepo.createNewAutor("Jan", "Kowalski");

        System.out.println("Tutaj jeszcze działa");
    }
}
