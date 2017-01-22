package com.calculadora.paco.upccal;

/**
 * Created by Roger on 20/1/2017.
 */

public enum Assignatura {



    A1(1, "Termo", 1, new int[]{0,0}),
    A2(2, "Termo", 1, new int[]{1,0}),
    A3(3, "Dibuix",3, new int[]{3,2}),
    A4(4, "Dibuix", 3, new int[]{2,2}),
    A5(5, "ECO", 2, new int[]{5,4}),
    A6(6, "ECO", 2, new int[]{4,4}),
    A7(1, "Mates", 1, new int[]{3,3}),
    A8(8, "Fluids", 1, new int[]{3,4}),
    A9(9, "Materials", 1, new int[]{3,4}),
    A10(10, "PMA", 1, new int[]{3,4}),
    A11(11, "Resis", 1, new int[]{3,4}),
    A12(12, "Elasticitat", 3, new int[]{1,2}),
    A13(13, "Fisica", 3, new int[]{2,1});

    private int    codi;
    private String nom;
    private int    curs;
    private int[]  horaris;

    Assignatura(int codi, String nom, int curs, int[] horaris) {
        this.codi = codi;
        this.nom = nom;
        this.curs = curs;
        this.horaris = horaris;
    }

    public int getCodi() {return codi;}

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {return this.nom;}

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

    public void setHoraris(int[] horaris) {this.horaris = horaris;}

    @Override
    public String toString() {
        return getCurs() + ":" + getNom();
    }
}

