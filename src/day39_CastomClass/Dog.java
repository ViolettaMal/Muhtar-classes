package day39_CastomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;


    public void setInfo(String dogBreed, String dogSize, int dogAge, String dogColor, String dogName){
        // sets the info of the dog
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;


    }
    public void getInfo(){
        System.out.println(name + " is a " + age + " years old " + size + " " + color + " " + breed);

    }
    public void sleep(){
        System.out.println(name + " is sleeping");

    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void play(){
        System.out.println(name + " is playing");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

}
