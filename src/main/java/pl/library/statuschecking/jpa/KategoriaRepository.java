package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.sql.SQLOutput;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class KategoriaRepository {

    private static EntityManagerFactory factory = createEntityManagerFactory("sample");
    private static EntityManager em = factory.createEntityManager();

    public void createNewCathegory(String nazwaKategorii){

        System.out.println("---------------CREATING---------------");
        Kategoria newOne = new Kategoria(nazwaKategorii);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newOne);
        System.out.println("ID Kategorii: "+newOne.getId());
        transaction.commit();

    }

}
