package pl.library.statuschecking.jpa;

import pl.library.statuschecking.jpa.*;



public class FillingKsiazka {

    public FillingKsiazka() {

        AutorRepository arepo = new AutorRepository();
        KategoriaRepository krepo = new KategoriaRepository();
        WydawnictwoRepository wrepo = new WydawnictwoRepository();
        KsiazkaRepository ksiazkaRepository = new KsiazkaRepository();
        //KSIAZKA 1
        Autor autor = arepo.findById(5);
        Kategoria kategoria = krepo.findById(1);
        Wydawnictwo wydawnictwo = wrepo.findById(7);
        ksiazkaRepository.createKsiazka(2007,"Duma i uprzedzenie",autor,kategoria,wydawnictwo);

        Autor autor1 = arepo.findById(1);
        Kategoria kategoria1=krepo.findById(2);
        Wydawnictwo wydawnictwo1=wrepo.findById(7);
        ksiazkaRepository.createKsiazka(2000,"Władca pierścieni",autor1, kategoria1, wydawnictwo1);

        Autor autor2 = arepo.findById(2);
        Kategoria kategoria2=krepo.findById(5);
        Wydawnictwo wydawnictwo2=wrepo.findById(8);
        ksiazkaRepository.createKsiazka(1990, "Jane Eyre", autor2, kategoria2,wydawnictwo2);

        Autor autor3 = arepo.findById(2);
        Kategoria kategoria3=krepo.findById(7);
        Wydawnictwo wydawnictwo3=wrepo.findById(8);
        ksiazkaRepository.createKsiazka(1998, "Zabić drozda", autor3, kategoria3,wydawnictwo3);

        Autor autor4 = arepo.findById(3);
        Kategoria kategoria4=krepo.findById(8);
        Wydawnictwo wydawnictwo4=wrepo.findById(6);
        ksiazkaRepository.createKsiazka(2010, "Wichrowe wzgórza", autor4, kategoria4, wydawnictwo4);

        Autor autor5 = arepo.findById(3);
        Kategoria kategoria5=krepo.findById(8);
        Wydawnictwo wydawnictwo5=wrepo.findById(6);
        ksiazkaRepository.createKsiazka(2007, "Rok 1984", autor5, kategoria5, wydawnictwo5);

        Autor autor6 = arepo.findById(3);
        Kategoria kategoria6=krepo.findById(2);
        Wydawnictwo wydawnictwo6=wrepo.findById(6);
        ksiazkaRepository.createKsiazka(1995,"Przeminęło z wiatrem", autor6, kategoria6, wydawnictwo6);

        Autor autor7 = arepo.findById(4);
        Kategoria kategoria7=krepo.findById(1);
        Wydawnictwo wydawnictwo7=wrepo.findById(5);
        ksiazkaRepository.createKsiazka(2003,"Wojna i pokój", autor7, kategoria7, wydawnictwo7);

        Autor autor8 = arepo.findById(4);
        Kategoria kategoria8=krepo.findById(4);
        Wydawnictwo wydawnictwo8=wrepo.findById(5);
        ksiazkaRepository.createKsiazka(2002, "Zbrodnia i kara", autor8, kategoria8, wydawnictwo8);

        Autor autor9 = arepo.findById(5);
        Kategoria kategoria9=krepo.findById(5);
        Wydawnictwo wydawnictwo9=wrepo.findById(4);
        ksiazkaRepository.createKsiazka(2002,"Grona gniewu", autor9, kategoria9, wydawnictwo9);

        Autor autor10 = arepo.findById(5);
        Kategoria kategoria10=krepo.findById(6);
        Wydawnictwo wydawnictwo10=wrepo.findById(4);
        ksiazkaRepository.createKsiazka(2012, "Alicja w krainie czarów", autor10,kategoria10, wydawnictwo10);

        Autor autor11 = arepo.findById(5);
        Kategoria kategoria11=krepo.findById(6);
        Wydawnictwo wydawnictwo11=wrepo.findById(4);
        ksiazkaRepository.createKsiazka(2015,"Emma", autor11, kategoria11, wydawnictwo11);

        Autor autor12 = arepo.findById(6);
        Kategoria kategoria12=krepo.findById(1);
        Wydawnictwo wydawnictwo12=wrepo.findById(3);
        ksiazkaRepository.createKsiazka(2012, "Wyznania Gejszy", autor12, kategoria12, wydawnictwo12);

        Autor autor13 = arepo.findById(6);
        Kategoria kategoria13=krepo.findById(2);
        Wydawnictwo wydawnictwo13=wrepo.findById(3);
        ksiazkaRepository.createKsiazka(2021,"Kubuś Puchatek", autor13, kategoria13, wydawnictwo13);

        Autor autor14 = arepo.findById(6);
        Kategoria kategoria14=krepo.findById(3);
        Wydawnictwo wydawnictwo14=wrepo.findById(3);
        ksiazkaRepository.createKsiazka(1999,"Kobieta w bieli", autor14, kategoria14, wydawnictwo14);

        Autor autor15 = arepo.findById(7);
        Kategoria kategoria15=krepo.findById(4);
        Wydawnictwo wydawnictwo15=wrepo.findById(2);
        ksiazkaRepository.createKsiazka(1999,"Nowy wspaniały świat", autor15, kategoria15, wydawnictwo15);

        Autor autor16 = arepo.findById(7);
        Kategoria kategoria16=krepo.findById(5);
        Wydawnictwo wydawnictwo16=wrepo.findById(1);
        ksiazkaRepository.createKsiazka(2002,"Opowieść o dwóch miastach", autor16, kategoria16, wydawnictwo16);

        Autor autor17 = arepo.findById(7);
        Kategoria kategoria17=krepo.findById(6);
        Wydawnictwo wydawnictwo17=wrepo.findById(2);
        ksiazkaRepository.createKsiazka(2001,"Miłość w czasach zarazy", autor17, kategoria17, wydawnictwo17);

        Autor autor18 = arepo.findById(8);
        Kategoria kategoria18=krepo.findById(8);
        Wydawnictwo wydawnictwo18=wrepo.findById(1);
        ksiazkaRepository.createKsiazka(2008,"Tajemniczy ogród", autor18, kategoria18, wydawnictwo18);

        Autor autor19 = arepo.findById(9);
        Kategoria kategoria19=krepo.findById(8);
        Wydawnictwo wydawnictwo19=wrepo.findById(5);
        ksiazkaRepository.createKsiazka(2009,"Opętanie", autor19, kategoria19, wydawnictwo19);

        Autor autor20 = arepo.findById(9);
        Kategoria kategoria20=krepo.findById(6);
        Wydawnictwo wydawnictwo20=wrepo.findById(8);
        ksiazkaRepository.createKsiazka(2011,"Jaskółki i Amazonki", autor20, kategoria20, wydawnictwo20);

        Autor autor21 = arepo.findById(9);
        Kategoria kategoria21=krepo.findById(4);
        Wydawnictwo wydawnictwo21=wrepo.findById(7);
        ksiazkaRepository.createKsiazka(2012,"Okruchy dnia", autor21, kategoria21, wydawnictwo21);

        Autor autor22 = arepo.findById(9);
        Kategoria kategoria22=krepo.findById(5);
        Wydawnictwo wydawnictwo22=wrepo.findById(2);
        ksiazkaRepository.createKsiazka(2017,"Przygody Scherlocka Holmesa", autor22, kategoria22, wydawnictwo22);


    }
}
