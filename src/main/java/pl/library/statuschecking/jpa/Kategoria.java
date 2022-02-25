package pl.library.statuschecking.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String kategoria;

    public Kategoria() {

    }

    public Kategoria(String nazwa){
        this.kategoria=nazwa;
    }

    public int getId() {return this.id;}

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String nowaNazwa){
        this.kategoria=nowaNazwa;
    }
}
