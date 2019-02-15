package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class Produit {
    private int numéro;
    private String description;
    private int prixCourant;
    private LocalDate dateDebut;
    private LocalTime heureDebut;
    private static int MontantPasEnchereMinimal;
    private int coutParticipation;
    private boolean estDispo;

    public Produit(int numéro, String description, int prixCourant, int coutParticipation) {
        this.numéro = numéro;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.estDispo = false;
    }
    public String toString(){
        return "Numéro: "+this.numéro+"\n"+"description: "+this.description+
                "\n"+"prixCourant: " +this.prixCourant+"\n"+"Date: "
                +this.dateDebut +"\n"+"Heure: "+this.heureDebut+"\n"+
                "MontantPasEnchereMinimal: " +this.MontantPasEnchereMinimal;
    }

    public void demarrerEnchere(){
        dateDebut = LocalDate.now();
       heureDebut = LocalTime.now();
       estDispo = true;
    }
    public void arreterEnchere(){
        estDispo = false;
    }
    public ajouterOffre(OffreEnchere o){

    }
}
