
package com.info;
import java.util.Scanner;

public class Discount_Offers {
	
	public static void main(String[] args) {
		
		String[] productNames = {"Women T-shirts",
				 "Men T-shirts",
				 "Kids T-shirts",
				 "Women Ethnic Wear",
				 "Men Formals",
				 "Women Western Wear",
				 "Kids Night Suit",
				 "Men Jeans",
				 "Women Sarees",
				 "Girl Skirts"
	};
		int[] productPrices = {469,469,625,625,1000,899,999,625,725,500};
		
		System.out.println("Select the products from the below lists");
		
		for(int i=0; i<productNames.length;i++) {
			System.out.println((i+1) +")" + productNames[i] + "-Rs." + productPrices[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("How many products you want to purchase ?\n");
		int n = sc.nextInt();
		
		int totalAmount = 0;
		System.out.println("Enter products Purchased");
		
		for(int i=0;i<n;i++) {
			System.out.print("Product Numbers:");
			int productNumber = sc.nextInt();
			
			totalAmount += productPrices[productNumber-1];
		}
		 if(n >=5 && totalAmount > 3000 && totalAmount % 10 == 5) {
			 int finalAmount = totalAmount/2;
//			 int finalAmount = totalAmount - discount;
			 
			 System.out.println("Congrats! Yor are eligible for 50% discount on your total purchase...");
			 System.out.println("Your Actual total is:" + totalAmount);
			 System.out.println("Your total amount after discount is:" + finalAmount);
		 }
		 else {
			 System.out.println("Better luck next time!");
			 System.out.println("Your total purchase amount:" + totalAmount);
		 }
	}
}
