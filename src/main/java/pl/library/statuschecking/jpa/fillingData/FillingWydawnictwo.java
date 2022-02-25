package pl.library.statuschecking.jpa.fillingData;
import pl.library.statuschecking.jpa.WydawnictwoRepository;

public class FillingWydawnictwo {

    public FillingWydawnictwo(){

        WydawnictwoRepository wrepo = new WydawnictwoRepository();
        wrepo.createNewWydawnictwo("Egmont Polska");
        wrepo.createNewWydawnictwo("Prószyński");
        wrepo.createNewWydawnictwo("Wydawnictwo Naukowe PWN");
        wrepo.createNewWydawnictwo("Amber");
        wrepo.createNewWydawnictwo("Czytelnik");
        wrepo.createNewWydawnictwo("Nasza Księgarnia");
        wrepo.createNewWydawnictwo("Wydawnictwo Literackie");
        wrepo.createNewWydawnictwo("Helion");

    }

}
