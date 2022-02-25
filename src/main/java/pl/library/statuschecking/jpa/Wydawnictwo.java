package pl.library.statuschecking.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wydawnictwo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nazwaWydawnictwa;

    public Wydawnictwo(){

    }

    public Wydawnictwo(String nazwaWydawnictwa){
        this.nazwaWydawnictwa=nazwaWydawnictwa;
    }

    public int getId() {
        return this.id;
    }

    public String getNazwaWydawnictwa(){
        return this.nazwaWydawnictwa;
    }
    public void setNazwaWydawnictwa(String nazwaNowa){
        this.nazwaWydawnictwa = nazwaNowa;
    }

}
