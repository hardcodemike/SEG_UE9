import com.fasterxml.jackson.annotation.JsonIdentityReference;

import java.io.Serializable;

public class Student implements Serializable {
    private String vorname;
    @JsonIdentityReference
    private String nachname;
    private int alter;
    private int matrikelnummer;

    public Student(String vorname, String nachname, int alter, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString(){
        return "Vorname: " + getVorname() + " Nachname: " + getNachname() + " Alter: " + getAlter() + " Matrikelnummer: " + getMatrikelnummer();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
}
