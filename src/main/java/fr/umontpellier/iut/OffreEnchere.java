package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private LocalDate date;
    private LocalTime heure;
    private int prixCourant;
    private int prixMax;

    public OffreEnchere(int prixCourant, int prixMax) {
        this.date = LocalDate.now();
        this.heure = LocalTime.now();
        this.prixCourant = prixCourant;
        this.prixMax = prixMax;
    }
    public String toString(){
        return "Date: "+this.date+"\n"+"Heure: "+this.heure+"\n" +
                "Le prix courant: "+this.prixCourant+"\n"+"Le prix max: "+this.prixMax;
    }

    public int getPrixCourant() {
        return prixCourant;
    }

    public int getPrixMax() {
        return prixMax;
    }

    public void setPrixCourant(int prixCourant) {
        this.prixCourant = prixCourant;
    }
}
