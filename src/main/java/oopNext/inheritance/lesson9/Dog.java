package oopNext.inheritance.lesson9;

public abstract class Dog extends Alive {

    public int countLegs = 4;

    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void brake() {
        System.out.println("Пес рычит бляха");
    }

    public void getCountLegs() {
        System.out.printf("У каждой собаки есть %s лапы\n",countLegs);
    }

    public abstract void run();

    public void beAngry(){
        System.out.println("Собака бляха злится и рычит как сука");
    }
}
