package com.martyx.finalnaTrieda;

public class Animal2 extends Animal {


    public Animal2(String name, String color, int age) {
        super(name, color, age);
    }

    public void updateParentName(String name){
      this.setName(name);
    }
}
