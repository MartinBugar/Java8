package com.martyx.polymorfizmus;

public class Stvorec extends GrafickyObjekt {

    int dlzkaStrany;

    public Stvorec (int dlzkaStrany){
        this.dlzkaStrany =dlzkaStrany;
    }

    public int getDlzkaStrany(){
        return dlzkaStrany;
    }


    @Override
    void vykresli() {
        System.out.println("aAAAAA");
    }
}
