package com.martyx.generika;

import com.martyx.utils.NejakyPes;
import com.martyx.utils.NejakyPesSerialized;
import com.martyx.utils.Pes;

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
