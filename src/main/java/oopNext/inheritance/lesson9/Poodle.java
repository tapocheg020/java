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


}
