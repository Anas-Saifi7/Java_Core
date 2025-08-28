
package com.info;
import java.util.Scanner;


public class ElectricityBill {
	
	 public static float calcAmount(int Unitconsumed) {
	        float amount;
	        if(Unitconsumed < 200) {
	            amount= Unitconsumed*1.20f;
	        }
	        else if(Unitconsumed < 400) {
	             amount = Unitconsumed*1.50f;
	        }
	        else if(Unitconsumed < 600) {
	             amount = Unitconsumed*1.80f;
	        }
	        else {
	          amount =  Unitconsumed*2.00f;
	        }
	        return amount;
	       
	    }

    public static float calcSurcharge(float amount) {
        if (amount > 400) {
            return amount * 0.15f; 
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Electricity Bill");
        System.out.print("Enter Customer ID:");
        int CustomerId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the customer:");
        String CustomerName = sc.nextLine();
        System.out.print("Enter the unit consumed by the customer:");
        int Unitconsumed = sc.nextInt();

    
        float amount = calcAmount(Unitconsumed);
        float surcharge = calcSurcharge(amount);
        float netAmount = amount + surcharge;

        if (netAmount < 100) {
            netAmount = 100;
        }

        System.out.println("\nElectricity Bill");
        System.out.println("Customer ID :" + CustomerId);
        System.out.println("Customer Name :" + CustomerName);
        System.out.println("Unit Consumed :" + Unitconsumed);
        System.out.printf("Amount Charges @Rs. %.2f per unit :%.2f\n", (amount / Unitconsumed), amount);
        System.out.printf("Surcharge Amount :%.2f\n", surcharge);
        System.out.printf("Net Amount to be paid :%.2f\n", netAmount);



    }

}
