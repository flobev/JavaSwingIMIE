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
public class Compagnie {
    private int idcompagnie;
    private String nom;

    public Compagnie(int idcompagnie, String nom) {
        this.idcompagnie = idcompagnie;
        this.nom = nom;
    }

    public int getIdcompagnie() {
        return idcompagnie;
    }

    public void setIdcompagnie(int idcompagnie) {
        this.idcompagnie = idcompagnie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
