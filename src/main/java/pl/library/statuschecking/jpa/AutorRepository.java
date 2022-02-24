package pl.library.statuschecking.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class AutorRepository {

    private static EntityManagerFactory factory = createEntityManagerFactory("sample");
    private static EntityManager em = factory.createEntityManager();

    public void createNewAutor(String imie, String nazwisko){

        System.out.println("---------------CREATING---------------");
        Autor newOne = new Autor(imie, nazwisko);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(newOne);

        System.out.println("ID Autora: "+newOne.getId());

        transaction.commit();

    }

    public Autor findById(int id){
        System.out.println("-------------FIND BY ID------------------");
//        Autor autor = em.find(Autor.class, 1);
        return em.find(Autor.class, id);
//        System.out.println(autor.getId());
    }

}
