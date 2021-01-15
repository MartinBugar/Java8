package com.martyx.finalnaTrieda;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal("slon", "zeleny", 25);

        System.out.println(animal1.getName());
        System.out.println(animal1.getColor());
        System.out.println(animal1.getAge());
        System.out.println();


        Animal2 animal2 = new Animal2("slon25555","gggg",222);
        animal2.animalEating();




    }
}
