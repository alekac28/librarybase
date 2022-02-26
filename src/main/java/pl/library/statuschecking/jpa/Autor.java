package pl.library.statuschecking.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imie;
    private String nazwisko;

    public Autor() {

    }

    public Autor(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return this.id;
    }

    public String getImie(){
        return this.imie;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public void setImie(String imieNowe){
        this.imie = imieNowe;
    }

}
