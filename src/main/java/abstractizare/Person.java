package abstractizare;

public class Person {
    private String nume;
    private String prenume;
    private int varsta;
    private String meserie;

    public Person (String nume, String prenume, int varsta, String meserie)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.meserie = meserie;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", meserie='" + meserie + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getMeserie() {
        return meserie;
    }

    public void setMeserie(String meserie) {
        this.meserie = meserie;
    }
}
