/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.beans;

import java.sql.Time;

/**
 *
 * @author alilo
 */
public class Chambre {
   
            private int Num;
            private int Etage;
            private int NomLit;
            private float Prix;
            private boolean Dispo;
            private String Duree;

    public int getNum() {
        return Num;
    }

    public int getEtage() {
        return Etage;
    }

    public int getNomLit() {
        return NomLit;
    }

    public float getPrix() {
        return Prix;
    }

    public boolean isDispo() {
        return Dispo;
    }

    public String getDuree() {
        return Duree;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public void setEtage(int Etage) {
        this.Etage = Etage;
    }

    public void setNomLit(int NomLit) {
        this.NomLit = NomLit;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }

    public void setDispo(boolean Dispo) {
        this.Dispo = Dispo;
    }

    public void setDuree(String Duree) {
        this.Duree = Duree;
    }
    
}
