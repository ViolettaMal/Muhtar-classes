package day41_toString;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public void setCarInfo(String brand, String model, int year, double price, String color){
        this.brand=brand;
        this.model=model;
        this.year = year;
        this.price =price;
        this.color = color;
    }
    public String toString(){
        // 2020 BMW X5, Black, $75000.0
        return year + " " + brand + " " + model + ", " + color + ", $" +price;


        //return "Brand: " + brand + ", Model: " + model + ", Year: "+ year + ", Color: "+color + ", Price: $" + price;
    }




}
