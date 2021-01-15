package com.martyx.finalnaTrieda;

import java.util.Objects;

public class Animal {
    public String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public String getColor (){
        return color;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void animalEating (){
        System.out.println("zvieratko papa");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
