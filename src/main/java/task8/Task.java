package task8;

public class Task {

    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        restaurant1.cookHotDog();
        restaurant2.addProducts();
        restaurant2.cookHotDog();
        restaurant1.addProducts();
        restaurant1.cookHotDog();

    }
}
