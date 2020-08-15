package day41_toString;

import java.text.DecimalFormat;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length , double unitPrice, boolean isPersian){
       // argument can have the same name as instance variable
        // but local variable will be preffered
        // so we have to use this keyword to assign instance variable

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;


    }
    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;



        return isPersian ? totalPrice+200 : totalPrice;


    }

    public void getCarpetInfo(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("=====================");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Persian Carpet: " + isPersian);
        System.out.println("Total Price: " + df.format(calcCost()));
        System.out.println("======================");


    }

    public String toString(){
        return "Width: " + width + ", Length: " + length + ", Unit price: " + unitPrice + ", Persian: " + isPersian + ", Total price: " + calcCost();
    }




}
