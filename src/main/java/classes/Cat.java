package classes;

public class Cat {
    String name;
    double weight;
    String ownerName;

    public Cat(String nameCat, double weightCat, String ownerNameCat) {
        this.name = nameCat;
        this.weight = weightCat;
        this.ownerName = ownerNameCat;
    }

    public void destroySofa(String sofaOwner){
        System.out.printf("кот дерет диван %s", sofaOwner);
    }

    public String hunt(boolean isHunt){
        if(isHunt){
            return  "Мышь";
        } return    "Сова";
    }

    public String hunt(boolean isHunt, boolean succes){
        if(succes){
            if(isHunt){
                return  "Мышь";
            } return    "Сова";
        } return "Хуита ебучая нормас ладно ";
    }

    public void hunt(String timesOfDay){
        if (timesOfDay.equals("Утро")){
            System.out.println("mish");
        } else {
            System.out.println("xui v zhope");
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }



}
