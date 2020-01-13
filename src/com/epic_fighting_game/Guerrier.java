package com.epic_fighting_game;

public class Guerrier extends Personnage {
    public Guerrier(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public String cri() { return "Woarg"; }

    @Override
    public void attaque_basique(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int dommages =  this.getForce();
        System.out.println(
                "Joueur " + numero_joueur_actif + " utilise Coup d'épée et inflige " + dommages + " dommages."
        );
        adversaire.setVie(adversaire.getVie() - dommages);
        System.out.println("Joueur " + numero_joueur_passif + " perd " + dommages + " points de vie");
        if(adversaire.getVie() <= 0) {
            System.out.println("Joueur " + numero_joueur_passif + " est mort.");
        }
    }

    @Override
    public void attaque_speciale(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire) {
        int dommages = this.getForce()*2;
        System.out.println(
            "Joueur " + numero_joueur_actif + " utilise Coup de Rage et inflige " + dommages + " dommages."
        );
        adversaire.setVie(adversaire.getVie() - dommages);
        System.out.println("Joueur " + numero_joueur_passif + " perd " + dommages + " points de vie");

        if(adversaire.getVie() <= 0) {
            System.out.println("Joueur " + numero_joueur_passif + " est mort.");
        }

        int dommages_a_soi_meme = this.getForce() / 2;
        this.setVie(this.getVie() - dommages_a_soi_meme);
        System.out.println("Joueur " + numero_joueur_actif + " perd " + dommages_a_soi_meme + " points de vie");
    }
}
