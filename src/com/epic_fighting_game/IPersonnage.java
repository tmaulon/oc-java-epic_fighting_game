package com.epic_fighting_game;

public interface IPersonnage {
    public String cri();
    public void attaque_basique(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire);
    public void attaque_speciale(int numero_joueur_actif, int numero_joueur_passif, Personnage adversaire);
}
