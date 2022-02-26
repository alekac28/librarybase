package pl.library.statuschecking.jpa;

import javax.persistence.*;

@Entity
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="tytul",unique=true)
    private String tytul;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Kategoria kategoria;
    @OneToOne
    private Wydawnictwo wydawnictwo;
    private int rokProdukcji;

    public Ksiazka(int rokProdukcji, String tytul, Autor autor, Kategoria kategoria, Wydawnictwo wydawnictwo){
        this.autor = autor;
        this.kategoria=kategoria;
        this.rokProdukcji=rokProdukcji;
        this.tytul=tytul;
        this.wydawnictwo=wydawnictwo;
    }

    public Ksiazka(){

    }

//    public Ksiazka(int rokProdukcji, String tytul, Autor autor, Kategoria kategoria, Wydawnictwo wydawnictwo) {
//        this.rokProdukcji=rokProdukcji;
//        this.tytul=tytul;
//        this.autor=autor;
//        this.kategoria=kategoria;
//        this.wydawnictwo=wydawnictwo;
//    }

    public int getId() {
        return this.id;
    }

    public Autor getAutor() {return autor;}

    public int getRokProdukcji() {return rokProdukcji;}

    public Kategoria getKategoria() {return kategoria;}

    public String getTytul() {return tytul;}

    public void setAutor(Autor autor) {this.autor = autor;}

    public void setKategoria(Kategoria kategoria) {this.kategoria = kategoria;}

    public void setRokProdukcji(int rokProdukcji) {this.rokProdukcji = rokProdukcji;}

    public void setTytul(String tytul) {this.tytul = tytul;}

    public void setWydawnictwo(Wydawnictwo wydawnictwo) {this.wydawnictwo = wydawnictwo;}

}
