package pl.library.statuschecking.jpa.fillingData;

import pl.library.statuschecking.jpa.*;



public class FillingKsiazka {

    AutorRepository arepo = new AutorRepository();
    KategoriaRepository krepo = new KategoriaRepository();
    WydawnictwoRepository wrepo = new WydawnictwoRepository();
    KsiazkaRepository ksiazkaRepositor = new KsiazkaRepository();

    //KSIAZKA 1
    Autor autor = arepo.findById(5);
    Kategoria kategoria = krepo.findById(1);
    Wydawnictwo wydawnictwo = wrepo.findById(3);
    ksiazkaRepositor.createKsiazka();


}
