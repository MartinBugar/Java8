package com.martyx.Utils;

public class Pes {

    private String meno;

    public Pes(){}

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }



    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                '}';
    }
}
