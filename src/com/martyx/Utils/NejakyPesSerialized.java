package com.martyx.Utils;

import java.io.Serializable;

public class NejakyPesSerialized extends Pes implements Serializable {

    private String meno;

    public NejakyPesSerialized (String meno){
        this.meno = meno;
    }

    @Override
    public String getMeno() {
        return meno;
    }

    @Override
    public void setMeno(String meno) {
        this.meno = meno;
    }
}
