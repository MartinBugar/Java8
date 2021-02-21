package com.martyx.rozhrania;

public class KonfliktyVRozhraniach implements Anotherinterface,DefaultInterface {
    @Override
    public void metodaPrva() {

    }

    @Override
    public void metodaDruha() {

    }

    @Override
    public void metodaTretia() {//tu je konflikt tak musim ju overridnut aj ked je default
        Anotherinterface.super.metodaTretia();
        DefaultInterface.super.metodaTretia();
        System.out.println("Z konfliktyVInterface");
    }

    public static void main(String[] args) {
        KonfliktyVRozhraniach konfliktyVRozhraniach = new KonfliktyVRozhraniach();
        konfliktyVRozhraniach.metodaTretia();
    }
}
