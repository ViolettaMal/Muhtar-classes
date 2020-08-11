package day39_CastomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
       /* car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color = "White";
        car1.mileage = 20000;
        car1.price = 19000.50;*/
        car1.setInfo("Toyota", "Corolla", 2020,"Red", 55000,16000);
       // car1.getInfo();

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);




        System.out.println("======================================");

        Car car2 = new Car();

     /*   car2.brand = "BMW";
        car2.model = "Prius";
        car2.year = 2019;
        car2.color = "Gray";
        car2.mileage = 21000;
        car2.price = 30000.2;*/

        car2.setInfo("BMW", "X5", 2018,"Black", 15000, 40000);
        car2.getInfo();
      /*  System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);*/

        System.out.println("=============================");
        Car car3 = new Car();
        car3.setInfo("Audi", "A7", 2017,"White", 32000, 35000);
        car3.getInfo();


        System.out.println("======================");

        Car car4 = new Car();
        car4.setInfo("Jeep", "Wramgler", 1990,"Blue", 250000, 17000);
        car4.getInfo();
    }
}
