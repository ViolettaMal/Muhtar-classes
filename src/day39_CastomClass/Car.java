package day39_CastomClass;

public class Car {
    /*
        Attributes:
                    model, brand, year, color, mileage, price.

     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;


        /*
        car1: Toyota
        car2: BMW
        car3: Tesla

        // if we have static we'll have only 1 copy
         */
    }


    // 2012 Toyota Corolla, Red, 10000, $ 4500
    public void getInfo(){
        System.out.println(year + " " +brand + " " + model + ", " + color+ ", " + mileage+ ", $" + price );
    }

    public void start(){
        System.out.println(brand + " " + model + " is started");
    }





}
