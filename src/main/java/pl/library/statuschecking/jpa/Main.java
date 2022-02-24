package pl.library.statuschecking.jpa;

public class Main {

    public static void main(String[] args){

        AutorRepository arepo = new AutorRepository();
        arepo.createNewAutor("Jan", "Kowalski");
        arepo.createNewAutor("Jacek","Stasiak");

        System.out.println("Tutaj jeszcze działa");

        Autor autor = arepo.findById(2);
        System.out.println(autor.getId() + " " + autor.getImie() + " " + autor.getNazwisko());

    }
}
