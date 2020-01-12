package com.epic_fighting_game;

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

        /*
        * Début du comnbat :
        *  -> le joueur 1 commence et choisi un type d'attaque
        * */
        System.out.println("Joueur 1 (" + joueur1.getVie() + "Vitalité) veuillez choisir votre action(1 : Attaque Basique, 2 : Attaque Spéciale");
        Integer type_d_attaque_choisi = sc.nextInt();
        if (type_d_attaque_choisi.equals(1)){
            System.out.println(
                    "Joueur 1 utilise " +
                    joueur1.getAttaqueBasiqueNom() +
                    " et inflige " +
                    joueur1.attaque_basique() +
                    " dommages."
            );
            System.out.println("Joueur 2 a " + joueur2.getVie() + " points de vie");
            joueur2.setVie(joueur2.getVie() - joueur1.attaque_basique());
            System.out.println("Joueur 2 perd " + joueur1.attaque_basique() + " points de vie, il lui reste maintenant " + joueur2.getVie() + " points de vie");
        } else if(type_d_attaque_choisi.equals(2)) {
            System.out.println(
                    "Joueur 1 utilise " +
                            joueur1.getAttaqueSpecialeNom() +
                            " et inflige " +
                            joueur1.attaque_speciale() +
                            " dommages."
            );
            System.out.println("Joueur 2 a " + joueur2.getVie() + " points de vie");
            joueur2.setVie(joueur2.getVie() - joueur1.attaque_speciale());
            System.out.println("Joueur 2 perd " + joueur1.attaque_speciale() + " points de vie, il lui reste maintenant " + joueur2.getVie() + " points de vie");
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
