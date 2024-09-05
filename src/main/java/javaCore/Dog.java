package javaCore;

import java.util.Arrays;

public class Dog {

    private String name = "Eblan";
    private int age = 3;
    private String color = "purple";
    private String isUmniy = "nihuya";
    private String ownerName = "dodik";

    public Dog(){}

    public Dog(String nameDog, int ageDog, String colorDog, String isUmniyDog, String ownerNameDog) {
        this.name = nameDog;
        this.age = ageDog;
        this.color = colorDog;
        this.isUmniy = isUmniyDog;
        this.ownerName = ownerNameDog;
    }

    public void walkingOnStreet (String withOwnerName) {
        System.out.printf("Яна гуляет по улице вместе с %s", withOwnerName);
    }

    public void feed(String giver, String ...product){
        System.out.printf("Человек %s дает еду:Собака %s сьел", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isUmniy=" + isUmniy +
                '}';
    }
}
