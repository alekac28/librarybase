package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class WydawnictwoRepository {

    private static EntityManagerFactory factory = createEntityManagerFactory("sample");
    private static EntityManager em = factory.createEntityManager();

    public void createNewWydawnictwo(String nazwaWydawnictwa){

        System.out.println("---------------CREATING---------------");
        Wydawnictwo newOne = new Wydawnictwo(nazwaWydawnictwa);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newOne);
        System.out.println("ID Wydawnictwa: "+newOne.getId());
        transaction.commit();
    }

    public Wydawnictwo findById(int id){
        System.out.println("-------------FIND BY ID------------------");
        Wydawnictwo wydawnictwo =  em.find(Wydawnictwo.class, id);
        System.out.println(wydawnictwo.getId() + " " + wydawnictwo.getNazwaWydawnictwa());
        return em.find(Wydawnictwo.class, id);
    }

    public void updateNazwaWydawnictwa(Wydawnictwo wydawnictwo, String nowaNazwa){
        System.out.println("------------UPDATE-------------");
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        wydawnictwo.setNazwaWydawnictwa(nowaNazwa);
        transaction.commit();
    }

    public void delete(Wydawnictwo wydawnictwo){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(wydawnictwo);
        transaction.commit();
    }

}
