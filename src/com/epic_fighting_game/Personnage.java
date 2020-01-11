package com.epic_fighting_game;

public abstract class Personnage implements IAttaques_Personnage {
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;

    public Personnage(int niveau, int vie, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    /*
     * Getters & Setters
     * */
    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attaque_basique() {
        System.out.println("Attaque basique par défaut.");
    }

    @Override
    public void attaque_speciale() {
        System.out.println("Attaque spéciale par défaut.");
    }

    public String toString(){
        String str = "Je suis un objet de la class " + this.getClass() +
                " qui s'appelle "+ this.getClass().getSimpleName() +
                ", j'ai un niveau de :  " + this.niveau +
                ", j'ai " + this.vie + " points de vie,  j'ai une force de : " + this.force +
                ", j'ai une agilité de : " + this.agilite +
                ", et j'ai une intelligence de : " + this.intelligence;
        return str;
    }

}
