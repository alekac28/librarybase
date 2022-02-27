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

//        System.out.println("---------------CREATING---------------");
        Kategoria newOne = new Kategoria(nazwaKategorii);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newOne);
        System.out.println("##########Dodawanie kategorii##########");
        System.out.println("Dodano kategorię: "+newOne.getId()+" "+nazwaKategorii);
        transaction.commit();

    }

    //TO DO: Wyszukiwanie jeśli będzie to konieczne
    public Kategoria findById(int id){
        System.out.println("-------------FIND BY ID------------------");
        Kategoria kategoria =  em.find(Kategoria.class, id);
        System.out.println(kategoria.getId() + " " + kategoria.getKategoria());
        return em.find(Kategoria.class, id);


    }

    public void updateKategoria(Kategoria kategoria, String nowaNazwa){

        System.out.println("------------UPDATE-------------");
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        kategoria.setKategoria(nowaNazwa);
        transaction.commit();

    }

    public void delete(Kategoria kategoria){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(kategoria);
        transaction.commit();
    }



}
