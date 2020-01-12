package com.epic_fighting_game;

public class Mage extends Personnage {
    public Mage(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public String cri() {
        return "Abracadabra";
    }

    @Override
    public int attaque_basique() {
        return this.getIntelligence();
    }

    @Override
    public int attaque_speciale() {
        if (this.getVie() + (this.getIntelligence() * 2) > this.getNiveau() * 5) {
            this.setVie(this.getNiveau() * 5);
        } else {
            this.setVie(this.getVie() + (this.getIntelligence() * 2));
        }
        return this.getVie();
    }
}
