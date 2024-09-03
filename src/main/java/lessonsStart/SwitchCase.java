package lessonsStart;

public class SwitchCase {

    public static void main(String[] args) {
//        String name = args[0];
//
//        switch(name) {
//            case "Игорь" -> System.out.println("Igor");
//            case "Илья" -> System.out.println("Iluha");
//            default -> System.out.println("A ya yebu???");
//        }

        boolean isWorkEngein = true;
        boolean isWorkTransmission = false;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;

        int countIsFineWheel = 0;
        countIsFineWheel += isFineWheel1 ? 1 : 0;
        countIsFineWheel += isFineWheel2 ? 1 : 0;
        countIsFineWheel += isFineWheel3 ? 1 : 0;
        countIsFineWheel += isFineWheel4 ? 1 : 0;

        if (isWorkEngein && isWorkTransmission && countIsFineWheel >=3) {
            System.out.println("Бро твоя машинка может ездить врым врум врам нах ю вин");
        } else if(countIsFineWheel < 3) {
            System.out.println("У тя бля 2 колеса или больше пробито але нах ю луз");
        } else {
            System.out.println("у тя ващет машина даже не заводится ю луз");
        }


    }

}
