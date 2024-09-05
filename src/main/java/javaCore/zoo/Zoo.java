package javaCore.zoo;

import javaCore.Cat;
import javaCore.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed(){
        cat.feed("Ilya", "корм бля");
        dog.feed("Илюха", "Все подряд");

    }
}
