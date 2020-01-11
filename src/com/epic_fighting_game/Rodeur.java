package com.epic_fighting_game;

public class Rodeur extends Personnage {
    public Rodeur(int niveau, int vie, int force, int agilite, int intelligence) {
        super(niveau, vie, force, agilite, intelligence);
    }

    @Override
    public void attaque_basique() {
        System.out.println("Ceci est mon attaque basique : tir à l'arc");
    }

    @Override
    public void attaque_speciale() {
        System.out.println("Ceci est mon attaque basique : concentration");
    }
}
