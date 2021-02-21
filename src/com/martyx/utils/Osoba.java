package com.martyx.utils;

import java.io.Serializable;

public class Osoba implements Serializable, Comparable<Osoba> {

    private String meno;
    private String priezvisko;
    private int vek;

    public Osoba (String meno, String priezvisko, int vek){
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public String getMeno (){
        return meno;
    }

    public void setMeno (String meno){
        this.meno = meno;
    }

    public String getPriezvisko (){
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko){
        this.priezvisko = priezvisko;
    }

    public int getVek (){
        return vek;
    }

    public void setVek(int vek){
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        int porovnaniePriezviska = o.getPriezvisko().compareTo(this.getPriezvisko());
        return porovnaniePriezviska != 0 ? porovnaniePriezviska : o.getMeno().compareTo(this.getMeno()) ;
    }
}
