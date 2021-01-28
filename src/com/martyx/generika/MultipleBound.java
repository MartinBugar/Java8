package com.martyx.generika;

import com.martyx.Utils.NejakyPes;
import com.martyx.Utils.NejakyPesSerialized;
import com.martyx.Utils.Pes;

import java.io.Serializable;

//genericky objekt musi splnit obi dve podmienky a to dedid od psa aj od interface serialized
public class MultipleBound  <P extends Pes & Serializable> extends NejakyPes { // musi byt ledna jedna trieda a ostatne interfacy
    private P object;

    public P getObject(){
        return object;
    }

    public void setObject(P object) {
        this.object = object;
    }


    public static void main(String[] args) {
        MultipleBound <NejakyPesSerialized> nejakyPesSerialized = new MultipleBound<>();

        nejakyPesSerialized.setObject(new NejakyPesSerialized("boby"));

        MultipleBound multipleBoundPes = new MultipleBound();
        multipleBoundPes.stekaj();

        //MultipleBound <NejakyPes> nejakyPesMultipleBound = new MultipleBound<NejakyPes>(); // chyba - neimplemwntuje interface serialized
    }
}
