package com.epic_fighting_game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Début du jeu
        // initialisation scanner
        Scanner sc = new Scanner(System.in);
        // initialisation du compteur de joueurs
        int compteur_joueur = 0;

        /*
         * Création joueur 1
         * */
        System.out.println("Création du personnage du joueur 1");
        Personnage joueur1 = creationJoueur(sc);
        compteur_joueur = compteur_joueur + 1;
        System.out.println(joueur1.toString(compteur_joueur));
        /*
        * Création joueur 2
        * */
        System.out.println("Création du personnage du joueur 2");
        Personnage joueur2 = creationJoueur(sc);
        compteur_joueur = compteur_joueur + 1;
        System.out.println(joueur2.toString(compteur_joueur));

        ArrayList<Personnage> joueurs = new ArrayList<>();
        joueurs.add(joueur1);
        joueurs.add(joueur2);

        /*
        * Début du comnbat
        * */
        for (int i = 0; i < joueurs.size(); i++) {
            int numero_joueur_actif = i + 1;
            int numero_joueur_passif = i == 1 ? 1 : 2;
            int index_joueur_actif = i;
            int index_joueur_passif = i == 1 ? 0 : 1;
            System.out.println("Joueur " + numero_joueur_actif + " (" + joueurs.get(index_joueur_actif).getVie() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            Integer type_d_attaque_choisi = sc.nextInt();
            if (type_d_attaque_choisi.equals(1)){
                joueurs.get(index_joueur_actif).attaque_basique(numero_joueur_actif, numero_joueur_passif, joueurs.get(index_joueur_passif));
            } else if(type_d_attaque_choisi.equals(2)) {
                joueurs.get(index_joueur_actif).attaque_speciale(numero_joueur_actif, numero_joueur_passif, joueurs.get(index_joueur_passif));
            }
            if (joueurs.get(index_joueur_passif).getVie() <= 0){
                System.out.println("Joueur " + numero_joueur_passif+ " a perdu !");
                // On met i à 1 pour sortir de la boucle
                i = 1;
            } else if (joueurs.get(index_joueur_actif).getVie() <= 0) {
                System.out.println("Joueur " + numero_joueur_actif+ " a perdu !");
                // On met i à 1 pour sortir de la boucle
                i = 1;
            } else {
                // Le second joueur jou et les joueurs ont encore des points de vie
                if(i == 1) {
                    // Donc on relance la boucle
                    i = -1;
                }
            }
        }
    }

    /**
     * Create a player with this method
     * @param sc de type Scanner
     * @return  joueur de type Personnage
     */
    private static Personnage creationJoueur(Scanner sc) {
        Personnage joueur = null;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        String perso_joueur_choisi = sc.nextLine();
        System.out.println("Niveau du personnage ?");
        String niveau_perso_joueur_choisi = sc.nextLine();
        System.out.println("Force du personnage ?");
        String force_perso_joueur_choisi = sc.nextLine();
        System.out.println("Agilité du personnage ?");
        String agilité_perso_joueur_choisi = sc.nextLine();
        System.out.println("Intelligence du personnage ?");
        String intelligence_perso_joueur_choisi = sc.nextLine();
        if (perso_joueur_choisi.equals("1")){
            joueur = new Guerrier(Integer.parseInt(niveau_perso_joueur_choisi), Integer.parseInt(force_perso_joueur_choisi), Integer.parseInt(agilité_perso_joueur_choisi), Integer.parseInt(intelligence_perso_joueur_choisi));
        } else if (perso_joueur_choisi.equals("2")) {
            joueur = new Rodeur(Integer.parseInt(niveau_perso_joueur_choisi), Integer.parseInt(force_perso_joueur_choisi), Integer.parseInt(agilité_perso_joueur_choisi), Integer.parseInt(intelligence_perso_joueur_choisi));
        } else if(perso_joueur_choisi.equals("3")) {
            joueur = new Mage(Integer.parseInt(niveau_perso_joueur_choisi), Integer.parseInt(force_perso_joueur_choisi), Integer.parseInt(agilité_perso_joueur_choisi), Integer.parseInt(intelligence_perso_joueur_choisi));
        } else {
            System.out.println("Erreur, veuillez taper 1, 2 ou 3 pour choisir votre type de personnage.");
        }
        return joueur;
    }
}
