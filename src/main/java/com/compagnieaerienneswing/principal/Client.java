/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

import java.util.Date;

/**
 *
 * @author flo
 */
public class Client extends Personne{
    
    private String email;
    private String password;
    private int personne_idpersonne;

    public Client(String email, String password, int personne_idpersonne, int idpersonne, String nom, String prenom, Date dateNaiss, String adresse, String ville, String zipcode, int pays_idPays) {
        super(idpersonne, nom, prenom, dateNaiss, adresse, ville, zipcode, pays_idPays);
        this.email = email;
        this.password = password;
        this.personne_idpersonne = personne_idpersonne;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdpersonne() {
        return personne_idpersonne;
    }

    public void setIdpersonne(int personne_idpersonne) {
        this.personne_idpersonne = personne_idpersonne;
    }
}
