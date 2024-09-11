package oopNext.inheritance.lesson9;

public class Runner {

    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        poodle.brake();
        poodle.getCountLegs();
        poodle.run();
        System.out.println(poodle.countTeeth);
        poodle.breath();


        Shepherd shepherd = new Shepherd();
        shepherd.brake();
        shepherd.getCountLegs();
        shepherd.run();
        System.out.println(shepherd.countTeeth);
        shepherd.breath();

        Terier terier = new Terier();
        terier.brake();
        terier.getCountLegs();
        terier.run();
        System.out.println(terier.countTeeth);
        terier.breath();



    }
}
