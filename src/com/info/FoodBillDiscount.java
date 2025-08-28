
package com.info;
import java.util.Scanner;

public class FoodBillDiscount {
	
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter the age:");
     int age = sc.nextInt();
     System.out.print("Enter Bill amount:");
     double billAmount = sc.nextDouble();
     double discount;
     double finalBillAmount;

     if (age >= 60) {
         discount = billAmount * 0.30;

         if (discount > 300) {
             discount = 300;
         }
         finalBillAmount = billAmount - discount;
         System.out.println("Senior Citizen");
     } else {
         finalBillAmount = billAmount;
         System.out.println("Regular User");
     }

     System.out.printf("Final Bill amount: %.2f", finalBillAmount);
     
  }
}
