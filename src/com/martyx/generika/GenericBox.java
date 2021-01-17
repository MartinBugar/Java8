package com.martyx.generika;

public class GenericBox <P> {
    private P object;

    public void setObject ( P object){
        this.object = object;
    }

    public P getObject (){
        return object;
    }

    public static void main(String[] args) {

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setObject("ahoj");
        System.out.println(stringGenericBox.getObject());

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setObject(25);
        System.out.println(integerGenericBox.getObject());
    }
}
