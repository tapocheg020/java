package lessonsStart;

public class Cycles {
    public static void main(String[] args) {

        for(int i = 4; i < 20; i++) {
            System.out.printf("%d вот так вот цикле%n", i);
        }

        System.out.println("перерывчик%n");

        int count = 20;

        while(count < 40){
            System.out.printf("%d это уже цикле for%n", count);
            count++;
        }

    }
}
