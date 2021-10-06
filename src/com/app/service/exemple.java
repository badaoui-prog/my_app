package com.app.service;

import com.app.model.produit;

public class exemple {

    public static void main(String[] args) {
        produit pro = new produit("HP",73454656) ;

        afficher(pro);
    }

    private static void afficher(produit pro) {
        String s = "la marque de votre appareil";
        System.out.println(s + " " + pro.getName()+" et leur serie est "+ pro.getNum());
    }
}
