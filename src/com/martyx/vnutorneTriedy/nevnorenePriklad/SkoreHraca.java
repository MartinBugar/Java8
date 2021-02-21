package com.martyx.vnutorneTriedy.nevnorenePriklad;

public class SkoreHraca {
    private int skore;

    //SkoreHraca nevie nico Hracovi, vsetko mu musi byt podsunute
    public SkoreHraca(int skore){
        this.skore = skore;
    }

    public int getSkore(){
        return skore;
    }

    public void setSkore(int skore){
        this.skore = skore;
    }
}
