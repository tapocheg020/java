package Dog;

public class Runner {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Yana", 7, "Orange", "Yes", "Илья");
        Dog dogTwo = new Dog("Yara", 8, "Black", "Yes", "Илья");


//        System.out.println(dogOne.name);
//        System.out.println(dogTwo);

        dogOne.walkingOnStreet("Ильей");
        System.out.println("\n");
        dogTwo.walkingOnStreet("новым хозяином\n");

        Dog dogThree = new Dog();
        System.out.println(dogThree);
    }



}
