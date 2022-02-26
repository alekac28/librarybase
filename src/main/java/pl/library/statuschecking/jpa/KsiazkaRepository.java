package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class KsiazkaRepository {

    private static EntityManagerFactory factory = createEntityManagerFactory("sample");
    private static EntityManager em = factory.createEntityManager();

    public void createKsiazka(int rokProdukcji, String tytul, Autor autor, Kategoria kategoria, Wydawnictwo wydawnictwo){
        System.out.println("---------------CREATING---------------");
        Ksiazka newOne = new Ksiazka(rokProdukcji, tytul, autor, kategoria, wydawnictwo);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newOne);
        transaction.commit();
    }

}
