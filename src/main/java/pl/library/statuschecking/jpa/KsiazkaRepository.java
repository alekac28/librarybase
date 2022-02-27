package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import java.sql.SQLOutput;

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

    public String[] findByName(String title){
        System.out.println("Wyszukuję książkę...");
        //Query q = em.createQuery("SELECT tytul FROM Ksiazka WHERE tytul=:title",Ksiazka.class).setParameter("title", title).getSingleResult();

//        //String test = em.createQuery("SELECT tytul FROM Ksiazka WHERE tytul=:title",String.class).setParameter("title", title).getSingleResult();
        String imie = em.createQuery("SELECT a.imie FROM Autor a, Ksiazka k WHERE k.tytul=:title and k.autor=a.id",String.class).setParameter("title", title).getSingleResult();
        String nazwisko = em.createQuery("SELECT a.nazwisko FROM Autor a, Ksiazka k WHERE k.tytul=:title and k.autor=a.id",String.class).setParameter("title", title).getSingleResult();
        String[] arr = new String[2];
        arr[0] = imie;
        arr[1] = nazwisko;
        System.out.println("##########Wyniki wyszukiwania##########");
        System.out.println("Tytuł: "+title+"\nAutor: "+arr[0]+" "+arr[1]);
        return arr;
    }

}
