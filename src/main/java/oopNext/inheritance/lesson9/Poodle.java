package oopNext.inheritance.lesson9;

public class Poodle extends Dog {

    @Override
    public void run() {
        System.out.println("Пудель бежит еле еле душа в ainal");

    }

    public Poodle(){
        super(28);
    }

    @Override
    public void breath() {
        System.out.println("Ну пудель дышит как дышит\n");
    }

    public void beAngry(){
        System.out.println("-------------------------------");
        System.out.println("Пудель мелкий на кого он там рычать то может");
        super.beAngry();
        System.out.println("Я понял ток на хазяев бляха");
        System.out.println("-------------------------------");
    }


}
