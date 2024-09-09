package task8;

public class Restaurant {

    private static int sausageCount = 0;
    private static int breadCount = 0;

    public static void cookHotDog() {
        if(sausageCount > 0 && breadCount > 1){
            sausageCount--;
            breadCount--;
            System.out.println("Да братан я могу заебашить тебе хот док бро епта");
        } else {
            System.out.println("К сожилению у меня не получится, нет ингридиентов падлы не привезли видимо хз");
        }

    }

    public void addProducts(){
        System.out.println("Пришла партия братанчек");
        sausageCount += 100;
        breadCount += 200;
    }



}
