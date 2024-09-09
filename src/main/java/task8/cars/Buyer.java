package task8.cars;

public class Buyer {
    public static void main(String[] args) {
        Dealer firstTachka = new Dealer();
        Dealer secondBuyer = new Dealer();
        firstTachka.addCountCars(10);
        firstTachka.buyMachine("Porshe", 8_000_000);

//        firstTachka.addCountCars(23);

        secondBuyer.addCountCars(23);
        secondBuyer.buyMachine("BMW", 12_000_00);
    }

}
