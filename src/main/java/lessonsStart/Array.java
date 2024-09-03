package lessonsStart;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;


        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[1] = 14;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        char[] answer = {'d', 'o', 'h', 'a'};
        System.out.println(answer);
    }
}
