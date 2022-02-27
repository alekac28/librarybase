package pl.library.statuschecking.jpa.fillingData;

import pl.library.statuschecking.jpa.AutorRepository;

public class FillingAutor {

        public FillingAutor(){
            //        Dodawanie do bazy

            AutorRepository arepo = new AutorRepository();
            arepo.createNewAutor("Jan", "Kowalski");
            arepo.createNewAutor("Bartlomiej","Czarnecki");
            arepo.createNewAutor("Kryspin", "Ostrowski");
            arepo.createNewAutor("Damian", "Pawlak");
            arepo.createNewAutor("Gustaw","Ostrowski");
            arepo.createNewAutor("Alek", "Szymczak");
            arepo.createNewAutor("Berenika", "Czerwińska");
            arepo.createNewAutor("Magdalena","Sikorska");
            arepo.createNewAutor("Marcelina","Michalak");
            arepo.createNewAutor("Test","Testowy");

        }


    }

