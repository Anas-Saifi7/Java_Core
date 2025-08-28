
package com.info;
import java.util.Scanner;

class Vechicle{
    String vechRegNum;
    String vechColor;
    String vechFuType;
    int vechType;
    int manufyear;
    int mileage;

    public Vechicle(int manufyear, int mileage, String vechFuType, String vechRegNum, int vechType, String vechColor) {
        this.manufyear = manufyear;
        this.mileage = mileage;
        this.vechFuType = vechFuType;
        this.vechRegNum = vechRegNum;
        this.vechType = vechType;
        this.vechColor = vechColor;
    }
    public int calculateAge(int currentYear) {
        return currentYear - manufyear;
    }
    public int getLifespan() {
        return vechFuType.equalsIgnoreCase("Petrol") ? 15 : 10;
    }
    public int getExpiryYear() {
        return manufyear + getLifespan();
    }
public void Display(int currentYear) {
    int age = calculateAge(currentYear);
    System.out.println("Vehicle Details");
    System.out.println("\nVehicle number:" + vechRegNum);
    System.out.println("Vehicle Type: " + (vechType == 1 ? "Hatchback" : vechType == 2 ? "SUV" : "XUV"));
    System.out.println("Vehicle Color:" + vechColor);
    System.out.println(" Fuel Type:" + vechFuType);
    System.out.println("Manufacturing year:" + manufyear);
    System.out.println(" Mileage:" + mileage);
    System.out.println("Age of vehicle: " + age + " Km/H");

    if (age > getLifespan()) {
        System.out.println("Vehicle is not within the life span");
    } else {
        System.out.println("Vehicle can be used till " + getExpiryYear());
    }
  }
}
public class VichleLifeSpan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle details");
        System.out.print("\nVehicle number:");
        String vechRegNum = sc.nextLine();
        System.out.print("Vehicle Type (1 for Hatchback / 2 for SUV / 3 for XUV):");
        int vechType = sc.nextInt();
        sc.nextLine();
        System.out.print("Vehicle color:");
        String vechColor = sc.nextLine();
        System.out.print(" Fuel Type:");
        String vechFuType = sc.nextLine();
        System.out.print("Manufacturing year:");
        int manufyear = sc.nextInt();
        System.out.print(" Mileage:");
        int mileage = sc.nextInt();

        Vechicle vehicle = new Vechicle(manufyear, mileage, vechFuType, vechRegNum, vechType, vechColor);
        vehicle.Display(2024);
    }
}

