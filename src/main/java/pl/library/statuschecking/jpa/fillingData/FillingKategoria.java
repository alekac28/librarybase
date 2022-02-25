package pl.library.statuschecking.jpa.fillingData;

import pl.library.statuschecking.jpa.KategoriaRepository;

public class FillingKategoria {

    public FillingKategoria() {

        KategoriaRepository krepo = new KategoriaRepository();
        krepo.createNewCathegory("Obyczajowa");
        krepo.createNewCathegory("Fantastyczno - naukowa");
        krepo.createNewCathegory("Fantastyka");
        krepo.createNewCathegory("Naukowe");
        krepo.createNewCathegory("Dokumentalne");
        krepo.createNewCathegory("Kryminalne");
        krepo.createNewCathegory("Detektywistyczne");
        krepo.createNewCathegory("Młodzieżowe");

    }
}

