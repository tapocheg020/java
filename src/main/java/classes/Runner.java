package classes;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Kuzya", 3.5, "Ilya");

//        System.out.println(cat);
//        cat.name = "Kochak";
//        System.out.println(cat.name);

        cat.destroySofa("Ильи\n");
//        System.out.println(cat);

        String hunt = cat.hunt(true);
        System.out.println(hunt);

        String peregruzka = cat.hunt(false, true);
        System.out.println(peregruzka);

        cat.hunt("Утfро");
    }

}
