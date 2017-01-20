package com.calculadora.paco.upccal;

/**
 * Created by Roger on 20/1/2017.
 */

public class Assignatura {
    private int    codi;
    private String nom;
    private int    curs;
    private String aula;
    private int[]  horaris;

    public Assignatura(int codi, String nom, int curs, int[] horaris) {
        this.codi = codi;
        this.nom = nom;
        this.curs = curs;
        this.horaris = horaris;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public int[] getHoraris() {
        return horaris;
    }

    public void setHoraris(int[] horaris) {
        this.horaris = horaris;
    }
}
