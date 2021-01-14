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
public class Reservation {
    
    private int idvol;
    private int client_idpersonne;
    private Enum confirmation;
    private int personne_idpersonne;

    public Reservation(int idvol, int client_idpersonne, Enum confirmation, int personne_idpersonne) {
        this.idvol = idvol;
        this.client_idpersonne = client_idpersonne;
        this.confirmation = confirmation;
        this.personne_idpersonne = personne_idpersonne;
    }

    public int getIdvol() {
        return idvol;
    }

    public void setIdvol(int idvol) {
        this.idvol = idvol;
    }

    public int getClient_idpersonne() {
        return client_idpersonne;
    }

    public void setClient_idpersonne(int client_idpersonne) {
        this.client_idpersonne = client_idpersonne;
    }

    public Enum getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(Enum confirmation) {
        this.confirmation = confirmation;
    }

    public int getPersonne_idpersonne() {
        return personne_idpersonne;
    }

    public void setPersonne_idpersonne(int personne_idpersonne) {
        this.personne_idpersonne = personne_idpersonne;
    }
    
}
