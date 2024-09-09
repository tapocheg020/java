package task8.cars;

public class Dealer {

    private String carBrand;
    private int priceCar;


    static int auto = 0;
    static int mekhanic = 0;

//    public Dealer(String carBrand, int priceCar) {
//        this.carBrand = carBrand;
//        this.priceCar = priceCar;
//    }

    @Override
    public String toString() {
        return "Dealer{" +
                "carBrand='" + carBrand + '\'' +
                ", price=" + priceCar +
                '}';
    }

    public void buyMachine(String car, int price){
        this.carBrand = car;
        this.priceCar = price;
        if(auto > 0 ){
            System.out.printf("У нас есть  %s за %s с автоматом\n", car, price);
            auto--;
        } else if (mekhanic > 0){
            System.out.printf("У нас есть  %s за %s с механикой\n",car, price);
            mekhanic--;
        } else {
            System.out.println("Нет паходу машин, кофе будете?\n");
        }

    }

    public  void addCountCars(int carsVoid){
        if(carsVoid < 11){
            auto += 10;
        } else {
            mekhanic +=30;
            System.out.println("Пришли вот тачки как и с автоматом так и с механикой.");
        }


    }
}
