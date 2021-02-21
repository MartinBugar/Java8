package com.martyx.utils;

public class Pes {

    private String meno;

    public Pes(){}

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void stekaj (){
        System.out.println("haf");
    }



    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                '}';
    }
}
