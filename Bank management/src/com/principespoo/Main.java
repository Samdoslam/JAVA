package com.principespoo;

import com.principespoo.models.CompteBancaire;
import com.principespoo.models.CompteProfessionnel;


public class Main {
    public static void main(String[] args) {
       CompteBancaire C1 = new CompteBancaire(123443,999999.99,"Nouhi");
        System.out.println(C1.toString());
        C1.setSolde(21.65);
        System.out.println(C1.toString());
        CompteProfessionnel CP = new CompteProfessionnel(124,100.99,"Dah",50);
        CP.retirer(80);
        System.out.println(CP.toString());
        CompteBancaire [] CB = new CompteBancaire[10];


    }
}