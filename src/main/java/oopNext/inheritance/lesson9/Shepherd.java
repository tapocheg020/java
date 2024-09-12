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

    @Override
    public void beAngry(){
        System.out.println("-------------------------------");
        System.out.println("Овчарка увидела чужого челикса");
        super.beAngry();
        System.out.println("Овчарка успокоилась тк я сказал ей свои");
        System.out.println("-------------------------------");
    }


}
