package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private int soldeCompte;
    private ArrayList <OffreEnchere> listOffreEnchere;

    public Compte(String pseudo, String email, String adresse, int soldeCompte) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.soldeCompte = soldeCompte;
    }
    public void creerOffre(Produit produit,int prixCourant, int prixMax){
        OffreEnchere o = new OffreEnchere(prixCourant, prixMax);
        listOffreEnchere.add(o);
    }
    public String toString(){
        return "Pseudo: "+this.pseudo+"\n"+"Email: "+this.email+"\n"+"Adresse: "
                +this.adresse+"\n"+"Solde du compte: "+ this.soldeCompte;
    }
}
