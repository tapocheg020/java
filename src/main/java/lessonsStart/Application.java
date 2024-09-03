package lessonsStart;

class Metods {
    void createTable(){
        System.out.println("Создаю самый обычныый стол");
    }

    void createTable(String color) {
//        color="red";
        System.out.printf("Создаю стол %s цвета%n", color);
    }

    void createTable(String color, int numberOfLegs){
//        color = "black";
//        numberOfLegs = 4;
        System.out.printf("Создаю стол %s цвета с %d ножками%n", color, numberOfLegs);
    }


    void createTable(int numberOfLegs, String color){
//        color = "white";
//        numberOfLegs = 2;
        System.out.printf("такой же метод но теперь я создаю стол %s цвета с %d ножками%n", color, numberOfLegs);
    }
    public void callMetods(){
        createTable();
        createTable("red");
        createTable("red", 4);
        createTable(2, "black");


    }
}

public abstract class Application {

    public static void main(String[] args) {
        Metods obj = new Metods();

        obj.callMetods();
    }



}
