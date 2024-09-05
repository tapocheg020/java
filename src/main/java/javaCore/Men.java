package javaCore;

public class Men {
    private String name = "vanya";
    private int age = 17;
    private String isWork = "nihuya";

    {
        System.out.println("Человек обозначился!!");
    }

    public Men (){}

    public Men(String name, int age, String isWork) {
        if(age < 2){
            this.age = 5;
        } else {
            this.age = this.age;
        }
        this.name = name;
        this.isWork = isWork;
    }

    public void setAge(int newAge){
        if(newAge < 2){
            this.age = 5;
        } else {
            this.age = newAge;
        }
    }

    public String getName(){
        return "Mr." + this.name;
    }



    @Override
    public String toString() {
        return "Men{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWork='" + isWork + '\'' +
                '}';
    }
}
