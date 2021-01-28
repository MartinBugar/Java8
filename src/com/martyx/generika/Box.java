package com.martyx.generika;

public class Box {


    //CELE TRIEDA JE ZLAAA

    private Object object;

    public void addObject (Object object){
        this.object = object;
    }

    public Object getObject(){
        return object;
    }

    public static void main(String[] args) {
        Box integerBox = new Box();
        integerBox.addObject("2");

        Integer integer = Integer.valueOf(String.valueOf(integerBox));
        System.out.println(integer);
    }
}
