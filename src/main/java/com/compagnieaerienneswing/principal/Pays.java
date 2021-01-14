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
public class Pays {
    
    private int idPays;
    private String nom;

    public Pays(int idPays, String nom) {
        this.idPays = idPays;
        this.nom = nom;
    }

    public int getIdPays() {
        return idPays;
    }

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
