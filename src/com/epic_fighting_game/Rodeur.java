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
    public int attaque_basique() {
        return this.getAgilite();
    }

    @Override
    public int attaque_speciale() {
        this.setAgilite( this.getAgilite() + (this.getAgilite() / 2));
        return this.getAgilite();
    }
}
