package com.martyx.generika;

import com.martyx.utils.Osoba;

public class MultipleGenericBox <P, T> {
    private P object1;
    private T object2;

    public void add(P object1, T object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "MultipleGenericBox{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }

    public static void main(String[] args) {
        MultipleGenericBox<String, Integer> multipleGenericBox = new MultipleGenericBox<>();
        multipleGenericBox.add("martin", 25);

        MultipleGenericBox <Osoba, Integer> multipleGenericBox2 = new MultipleGenericBox<>();
        multipleGenericBox2.add(new Osoba("martinus","neviem",25), 25);

        System.out.println(multipleGenericBox);
        System.out.println(multipleGenericBox2);
    }
}
