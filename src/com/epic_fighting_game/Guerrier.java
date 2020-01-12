package com.epic_fighting_game;

public class Guerrier extends Personnage {
    public Guerrier(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    @Override
    public String cri() {
        return "Woarg";
    }


    @Override
    public int attaque_basique() {
        return this.getForce();
    }

    @Override
    public int attaque_speciale() {
        this.setVie(this.getVie() - (this.getForce()/2));
        return this.getForce()*2;
    }
}
