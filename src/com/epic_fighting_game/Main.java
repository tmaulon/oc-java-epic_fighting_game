package com.epic_fighting_game;

public class Main {
    public static void main(String[] args) {
    //Les méthodes d'un Rôdeur
    Rodeur rodeur = new Rodeur(50, 40, 30, 20, 10);
    System.out.println(rodeur.toString());

    System.out.println("--------------------------------------------");
    //Les méthodes de l'interface
        rodeur.attaque_basique();
        rodeur.attaque_speciale();

    System.out.println("--------------------------------------------");
    //Utilisons le polymorphisme de notre interface
    }
}
