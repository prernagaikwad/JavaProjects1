
import java.io.*;
import java.util.*;

public class House
{
    int numberofRooms;
    String  housetype;
    String address;
    double price;

    public House(String housetype, int numberofRooms, String address, double price)
    {
        this.housetype=housetype;
        this.numberofRooms=numberofRooms;
        this.address = address;
        this.price =price;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHousetype()
    {
        return housetype;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails()
    {
        System.out.println("Type of house is  " + getHousetype());
        System.out.println("Address of house is " +getAddress());
        System.out.println("The no of rooms in house is " +getNumberofRooms());
        System.out.println("The price of house is "+getPrice());
    }

    public static void main(String[] args)
    {
        //House h1 =new House();
        //System.out.println(h1.address);
        //System.out.println(h1.housetype);
        //System.out.println(h1.price);

        House h1 =new House("Flat",6,"pune",800000);
        House h2 = new House("Bunglow",8,"Mumbai",980000);
        House h3;
        h3=new House("Rowhouse",7,"Nashik",1000000);
        House h4;
        h4=h3;


        System.out.println("House 1 details");
        h1.displayDetails();
        System.out.println("--------------------------------");
        System.out.println("House 2 details");
        h2.displayDetails();
        System.out.println("--------------------------------");
        System.out.println("House 3 details");
        h3.displayDetails();
        System.out.println("--------------------------------");
        System.out.println("House 4 Details");
        h4.displayDetails();
        System.out.println("---------------------------------");

    }
}
