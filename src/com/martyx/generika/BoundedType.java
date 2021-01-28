package com.martyx.generika;

import com.martyx.Utils.NejakyPes;
import com.martyx.Utils.Osoba;
import com.martyx.Utils.Pes;

public class BoundedType <P extends Pes> { //Generikum moze byt potom len Pes a nejaky pes
    /*
    tato trieda vyuziva vsetky tu zadefinovane premmenne a metody.
     */
    private P object; //instancia patri pod triedu BoundedType

    public P getObject() {
        return object;
    }

    public void setObject(P object) {
        this.object = object;
    }

    public void stekaj (){
        System.out.println("haf haf");
    }

    public static void main(String[] args) {

        //Moze tam byt len objekt triedy PES
        BoundedType pesBoundedType = new BoundedType<>(); // <Pes> mi urcuje aky Typ je predstavovany pismenom P pri volani metod s P
        Pes pes = new Pes();
        pesBoundedType.setObject(pes);
        pesBoundedType.stekaj();

        //Moze tam byt len objekt triedy NejakyPes
        BoundedType <NejakyPes> nejakyPesBoundedType = new BoundedType<>();// <Pes> mi urcuje aky Typ je predstavovany pismenom P
        NejakyPes nejakyPesNew = new NejakyPes();
        nejakyPesBoundedType.setObject(nejakyPesNew);
        nejakyPesBoundedType.stekaj();
    }
}
