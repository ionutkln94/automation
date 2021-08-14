package abstractizare;

public class Person_Angajat_Student extends Person implements Angajat, Student{
    public Person_Angajat_Student(String nume, String prenume, int varsta, String meserie) {
        super(nume, prenume, varsta, meserie);
    }

    @Override
    public void lucreaza() {

    }

    @Override
    public void afiseaza_detalii() {

    }

    @Override
    public void invata()
    {
        System.out.println("Studentul " + this.getNume() + " invata");
    }

    @Override
    public void afiseaza_detalii_student()
    {
        System.out.println(super.toString());
    }
}
