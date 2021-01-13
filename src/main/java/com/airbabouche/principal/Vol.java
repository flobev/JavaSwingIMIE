/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airbabouche.principal;

import java.util.Date;

/**
 *
 * @author flo
 */
public class Vol {
    
    private int idvol;
    private int place;
    private String intitule;
    private String aeroport_depart;
    private String aeroport_arrive;
    private Date date_depart;
    private Date date_arrive;
    private int idcompagnie;

    public Vol(int idvol, int place, String intitule, String aeroport_depart, String aeroport_arrive, Date date_depart, Date date_arrive, int idcompagnie) {
        this.idvol = idvol;
        this.place = place;
        this.intitule = intitule;
        this.aeroport_depart = aeroport_depart;
        this.aeroport_arrive = aeroport_arrive;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.idcompagnie = idcompagnie;
    }

    public int getIdvol() {
        return idvol;
    }

    public void setIdvol(int idvol) {
        this.idvol = idvol;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getAeroport_depart() {
        return aeroport_depart;
    }

    public void setAeroport_depart(String aeroport_depart) {
        this.aeroport_depart = aeroport_depart;
    }

    public String getAeroport_arrive() {
        return aeroport_arrive;
    }

    public void setAeroport_arrive(String aeroport_arrive) {
        this.aeroport_arrive = aeroport_arrive;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(Date date_arrive) {
        this.date_arrive = date_arrive;
    }

    public int getIdcompagnie() {
        return idcompagnie;
    }

    public void setIdcompagnie(int idcompagnie) {
        this.idcompagnie = idcompagnie;
    }
    
}
