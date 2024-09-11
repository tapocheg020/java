package oopNext.inheritance.lesson9;

public class Shepherd extends Dog{
    @Override
    public void run() {
        System.out.println("Овчарка бежит со скоростью быстра гы гы га");
    }

    public Shepherd() {
        super(30);
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит как зверюга\n");
    }


}
