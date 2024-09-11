package oopNext.inheritance.lesson9;

public class Terier extends Dog{
    @Override
    public void run() {
        System.out.println("Терьер бежит хз кто ето бляха");
    }

    public Terier(){
        super(25);
    }

    @Override
    public void breath() {
        System.out.println("Да пох терьер дышит не дышит поебать\n");
    }


}
