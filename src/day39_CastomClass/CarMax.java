package day39_CastomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();


        car1.setInfo("Toyota", "Prius", 2020,"White",5000,31000);
        car2.setInfo("Mazda", "Demio", 2008,"Silver",150000,10500);
        car3.setInfo("Tesla", "S3", 2019,"Black",10000,35000);
        car4.setInfo("BMW", "A8", 2017,"White",50000,37000);
        car5.setInfo("Porsche", "Q5", 2016,"Red",61000,27000);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        System.out.println("===================");
        car3.start();
        car3.start();




    }
}
