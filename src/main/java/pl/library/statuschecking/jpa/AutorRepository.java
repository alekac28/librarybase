package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class AutorRepository {

    private static EntityManagerFactory factory = createEntityManagerFactory("sample");
    private static EntityManager em = factory.createEntityManager();

    public void createNewAutor(String imie, String nazwisko){

        System.out.println("---------------CREATING---------------");
        Autor newOne = new Autor(imie, nazwisko);
        em.persist(newOne);

        System.out.println("ID Autora: "+newOne.getId());

    }

}
