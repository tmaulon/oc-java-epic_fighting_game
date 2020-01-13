package com.epic_fighting_game;

public class Mage extends Personnage {
    public Mage(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public String cri() { return "Abracadabra"; }

    @Override
    public void attaque_basique(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int dommages =  this.getIntelligence();
        System.out.println(
                "Joueur " + numero_joueur_actif + " utilise Boule de Feu et inflige " + dommages + " dommages."
        );
        adversaire.setVie(adversaire.getVie() - dommages);
        System.out.println("Joueur " + numero_joueur_passif + " perd " + dommages + " points de vie");
        if(adversaire.getVie() <= 0) {
            System.out.println("Joueur " + numero_joueur_passif + " est mort.");
        }
    }

    @Override
    public void attaque_speciale(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int vie_initiale = this.getNiveau() * 5;
        int vie_actuelle = this.getVie();
        int bonus = this.getIntelligence() * 2;

        //  Il ne peut pas avoir plus de vie qu’il n’en avait au départ
        if (vie_actuelle + bonus > vie_initiale) {
            this.setVie(vie_initiale);
        } else {
            this.setVie(vie_actuelle + bonus);
        }
        System.out.println(
                "Joueur " + numero_joueur_actif + " utilise Soin et gagne " + bonus + " en vitalité."
        );
    }
}
