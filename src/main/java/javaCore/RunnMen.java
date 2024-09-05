package javaCore;

import javaCore.zoo.Zoo;

public class RunnMen {

    public static void main(String[] args) {
        Dog dog = new Dog("Mukhtar", 6, "black", "da", "ilya");
        Cat cat = new Cat("Кузя", 6.7, "Ilya");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
