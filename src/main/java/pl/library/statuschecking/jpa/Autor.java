package pl.library.statuschecking.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String imie;
    private String nazwisko;

    public Autor(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return this.id;
    }
}