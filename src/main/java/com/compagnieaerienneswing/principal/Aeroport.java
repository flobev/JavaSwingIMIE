/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

/**
 *
 * @author flo
 */
public class Aeroport {
   
    private int idaeroport;
    private String nom;
    private String ville;
    private int idpays;

    public Aeroport(int idaeroport, String nom, String ville, int idpays) {
        this.idaeroport = idaeroport;
        this.nom = nom;
        this.ville = ville;
        this.idpays = idpays;
    }
    
    public int getIdaeroport() {
        return idaeroport;
    }

    public void setIdaeroport(int idaeroport) {
        this.idaeroport = idaeroport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getIdpays() {
        return idpays;
    }

    public void setIdpays(int idpays) {
        this.idpays = idpays;
    }
    
}
