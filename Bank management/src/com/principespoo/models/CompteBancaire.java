package com.principespoo.models;

import java.time.LocalDate;

public class CompteBancaire {


    private int numeroCompte;
    private double solde,montant;
    private String proprietaire ;

    public CompteBancaire() {
         numeroCompte = 1;
        solde = 0.0;
         montant = 0;
         proprietaire = "";
    }

    public CompteBancaire(int numeroCompte, double solde, String proprietaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }
    public int getNumeroCompte(){
        return numeroCompte;

    }
    public double getsolde(){
        return solde;
    }
    public String getProprietaire(){
        return proprietaire;
    }
    public void setProprietaire(String proprietaire){
        this.proprietaire=proprietaire;
    }
    public void setSolde(double solde){
        this.solde=solde;
    }
    public void setNumeroCompte(int NumeroCompte){
        this.numeroCompte=numeroCompte;
    }

    public void deposer(double montant){
        solde += montant;
            }
    public void retirer(double montant){
        if (solde <= 0) {
            System.out.println("Solde Insuffisant ! ");
        }else {
        solde -=montant;}
    }
    @Override
    public String toString(){
        return proprietaire+" de numero de compte : "+numeroCompte+" a un solde de "+solde;
    }



}
