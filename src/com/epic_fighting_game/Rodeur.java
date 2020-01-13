package com.epic_fighting_game;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public String cri() {
        return "Coucou";
    }

    @Override
    public void attaque_basique(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int dommages =  this.getAgilite();
        System.out.println(
                "Joueur " + numero_joueur_actif + " utilise Tir à l'Arc et inflige " +
                dommages + " dommages."
        );
        adversaire.setVie(adversaire.getVie() - dommages);
        System.out.println("Joueur " + numero_joueur_passif + " perd " + dommages + " points de vie");
        if(adversaire.getVie() <= 0) {
            System.out.println("Joueur " + numero_joueur_passif + " est mort.");
        }
    }

    @Override
    public void attaque_speciale(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int bonus = this.getNiveau() / 2;
        this.setAgilite( this.getAgilite() + bonus);
        System.out.println(
                "Joueur " + numero_joueur_actif + " utilise Concentration et gagne " + bonus + " points d'agilité."
        );
    }
}
