package com.martyx.polymorfizmus2;

public class C extends B{
    public C (){
        System.out.println("Vytvorenie konstruktora C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
