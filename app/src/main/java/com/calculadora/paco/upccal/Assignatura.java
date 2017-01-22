package com.calculadora.paco.upccal;

/**
 * Created by Roger on 20/1/2017.
 */

public enum Assignatura {



    A1(1, "Termo", 1, new int[]{0,0,1,0}),
    A2(2, "Dibuix",3, new int[]{3,2,2,2}),
    A3(3, "Eco", 2, new int[]{4,2,5,2}),
    A4(4, "Mates", 1, new int[]{2,0,1,0}),
    A5(5, "Fluids", 1, new int[]{2,4,3,4}),
    A6(6, "Material", 1, new int[]{4,4,5,4}),
    A7(7, "PMA", 1, new int[]{3,0,4,0}),
    A8(8, "Resis", 1, new int[]{1,1,2,1}),
    A9(9, "Elas.", 3, new int[]{0,2,1,2}),
    A10(10, "Fisica", 3, new int[]{4,1,5,1});

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

