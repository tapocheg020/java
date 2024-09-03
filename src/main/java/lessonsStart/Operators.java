package lessonsStart;

public class Operators {

    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();

        a = a + 10;
        b = b + 10;
        System.out.printf("%f %f %n", a, b);

        if(a > b) {
            System.out.println("Нормас a больше нах b");
        }

        if(a * 100 < 50) {
            System.out.println("повезло");
        } else {
            System.out.println("лошок");
        }

        if (a * 10 >b) {
            System.out.println("Третье условие первый иФ");
        }  else if (a * 30 < b) {
            System.out.println("Третье условие второй иФ");
        } else if (a + 40 * 20 > b) {
            System.out.println("Третье условие ластетский иФ");
        } else {
            System.out.println("иди нахуй сука");
        }
    }

}
