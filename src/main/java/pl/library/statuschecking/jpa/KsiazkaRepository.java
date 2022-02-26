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

    public String findByName(String title){
        System.out.println("Wyszukuję książkę...");
        //Query q = em.createQuery("SELECT tytul FROM Ksiazka WHERE tytul=:title",Ksiazka.class).setParameter("title", title).getSingleResult();

//        //String test = em.createQuery("SELECT tytul FROM Ksiazka WHERE tytul=:title",String.class).setParameter("title", title).getSingleResult();
        String tytul = em.createQuery("SELECT tytul FROM Ksiazka WHERE tytul=:title",String.class).setParameter("title", title).getSingleResult();
      // String tytul = em.createQuery("SELECT tytul, imie, nazwisko FROM Ksiazka INNER JOIN Autor ON Ksiazka.autor_id = Autor.id WHERE tytul=:title",String.class).setParameter("title", title).getSingleResult();
//        //Ksiazka ksiazka =
//        //System.out.println(tytul);
        return tytul;
    }

}
