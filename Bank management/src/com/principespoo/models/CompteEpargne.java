package com.principespoo.models;

public class CompteEpargne extends CompteBancaire{
   private double tauxinteret;

    public CompteEpargne(int numeroCompte, double solde, String proprietaire, double tauxinteret) {
        super(numeroCompte, solde, proprietaire);
        this.tauxinteret = tauxinteret;
    }
    public void calculerInteret(){
        double interets = (getsolde() *tauxinteret) /100;
    }



}
