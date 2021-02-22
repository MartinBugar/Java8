package com.martyx.Patterny.factory;

public class Kladivo {

    private String farba;
    private String vyrobca;
    private float dlzka;

    public Kladivo(){}

    public Kladivo(Builder builder) { // pride builder z ktoreho musim premiestnit udaje do kladivovych udajov
        setFarba(builder.farba);
        setVyrobca(builder.vyrobca);
        setDlzka(builder.dlzka);
    }

    public static Builder kladivoBuilder(){
        return new Builder();
    }

    public String getFarba(){
        return farba;
    }

    public void setFarba(String farba){
        this.farba = farba;
    }

    public String getVyrobca(){
        return vyrobca;
    }

    public void setVyrobca(String vyrobca){
        this.vyrobca = vyrobca;
    }

    public float getDlzka(){
        return dlzka;
    }

    public void setDlzka(float dlzka){
        this.dlzka = dlzka;
    }

    @Override
    public String toString() {
        return "Kladivo{" +
                "farba='" + farba + '\'' +
                ", vyrobca='" + vyrobca + '\'' +
                ", dlzka=" + dlzka +
                '}';
    }

    public static class Builder {
        private String farba;
        private String vyrobca;
        private float dlzka;

        private Builder(){
        }

        public Builder farba(String farba){
            this.farba = farba;
            return this; // vrati mi instanciu builderu ktory uz ma nasetovanu farbu
        }

        public Builder vyrobca(String vyrobca){
            this.vyrobca = vyrobca;
            return this;
        }

        public Builder dlzka (float dlzka){
            this.dlzka = dlzka;
            return this;
        }


        public Kladivo build() { // metoda mi vrati kladivo , to zavola konstruktor kde sa nasetuju parametre buildera do parametrov kladiva
            return new Kladivo(this); // this sa odkayuje na tento builder
        }
    }
}
