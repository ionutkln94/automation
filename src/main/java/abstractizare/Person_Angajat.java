package abstractizare;

public class Person_Angajat extends Person implements Angajat{

    public Person_Angajat(String nume, String prenume, int varsta, String meserie) {
        super(nume, prenume, varsta, meserie);
    }

    @Override
    public void lucreaza() {

    }

    @Override
    public void afiseaza_detalii() {

    }
}
