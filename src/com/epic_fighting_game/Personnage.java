package com.epic_fighting_game;

public abstract class Personnage implements IPersonnage {
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;

    public Personnage(int niveau, int force, int agilite, int intelligence) {
        if (niveau >= 1 && niveau <= 100){
            if (force + agilite + intelligence <= niveau ) {
                this.niveau = niveau;
                this.vie = niveau * 5;
                if(force >= 0 && force <= 100) {
                    this.force = force;
                } else {
                    System.out.println("La force du perso doit être comprise entre 0 inclus et 100 inclus.");
                }
                if(agilite >= 0 && agilite <= 100) {
                    this.agilite = agilite;
                } else {
                    System.out.println("L'agilité du perso doit être comprise entre 0 inclus et 100 inclus.");
                }
                if(intelligence >= 0 && intelligence <= 100) {
                    this.intelligence = intelligence;
                } else {
                    System.out.println("L'intelligence du perso doit être comprise entre 0 inclus et 100 inclus.");
                }
            } else {
                System.out.println("Le niveau du perso doit être supérieur ou égal à la somme de sa force, de son agilité et de son intelligence.");
            }
        } else {
            System.out.println("Veuillez choisir un niveau compris entre 1 inclus et 100 inclus.");
        }
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
        this.vie = vie ;
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

    public String toString(int counter){
        String str = this.cri() + " je suis le " + this.getClass().getSimpleName() + " Joueur " + counter +
                " un niveau " + this.niveau +
                " je possède " + this.vie + " de vitalité, " + this.force +
                " de force, " + this.agilite +
                " d'agilité, et " + this.intelligence + " d'intelligence !";
        return str;
    }

}
