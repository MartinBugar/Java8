package com.martyx.generika;

public class GenericBox <P> {
    private P object;

    public void addObject ( P object){
        this.object = object;
    }

    public P getObject (){
        return object;
    }

    public static void main(String[] args) {

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.addObject("ahoj");
        System.out.println(stringGenericBox.getObject());

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.addObject(25);
        System.out.println(integerGenericBox.getObject());
    }
}
