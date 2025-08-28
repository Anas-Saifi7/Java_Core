package com.info;
import java.util.Scanner;
public class FestiveCupon {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Welcome to Shradha Supermarket :");
    System.out.print("\nEnter your total amount of purchase:");
    double amount = sc.nextDouble();
    sc.nextLine();
    System.out.println("Do you have any coupon?(Y/N)");
    String str = sc.nextLine();
    if(str.equalsIgnoreCase("Y")){
        System.out.println("Enter Coupon Number:");
        String coupon = sc.nextLine();
        Cupon cupon  = new Cupon(coupon,amount);
        cupon.cuponProcessing();
    }
    else {
        System.out.println("Sorry!! seems you don't have any coupon..");
        System.out.println("Total amount you have to pay is " + amount);
      }
	}
}
