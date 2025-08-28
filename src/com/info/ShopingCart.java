package com.info;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
  class Iteam{
	  int code;
	  String name;
	  int qty;
	  
	public Iteam(int code, String name, int qty) {
		this.code = code;
		this.name = name;
		this.qty = qty;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	@Override
	public String toString() {
		return " Item Code:" + code + "\n Item Name:" + name + "\n Iteam Quantity:" + qty;
	}
  }
public class ShopingCart {
	
	List<Iteam> Cart = new ArrayList<>();
	public void addIteam(int code , String name, int qty) {
		Iteam newItem = new Iteam(code,name,qty);
		Cart.add(newItem);
	}
	public void RemoveItem(int code) {
		boolean found = false;
		for(Iteam Item : Cart) {
			if(Item.getCode()== code) {
				Cart.remove(Item);
				System.out.println("Item removed from cart.");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Iteam not found");
		}
	}
	
	public void ViewCart() {
		if(Cart.isEmpty()) {
			System.out.println("Cart is Empty");
		}
		for(Iteam Item : Cart) {
			System.out.println(Item);
		}
	}

	public static void main(String[] args) {
		ShopingCart system = new ShopingCart();
		Scanner sc = new Scanner(System.in);
		 while(true){
	            System.out.println("\n Shopping cart menu");
	            System.out.println("1. Insert new item in cart");
	            System.out.println("2. Remove an item from cart");
	            System.out.println("3. View cart items");
	            System.out.println("4. Exit");

	            System.out.println("Choice an option");
	            int choice = sc.nextInt();
	            switch(choice){
	                case 1:
	                    System.out.print("Enter item code: ");
	                    int code = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter item name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter item quantity: ");
	                    int qty = sc.nextInt();
	                    system.addIteam(code, name, qty);
	                    break;
	                case 2:
	                    System.out.print("Enter the code of an item: ");
	                    int removeCode = sc.nextInt();
	                    system.RemoveItem(removeCode);
	                    break;
	                case 3:
	                    system.ViewCart();
	                    break;
	                case 4:
	                    System.out.println("Thank you!!!");
	                   return;
	                default:
	                    System.out.println("Invalid choice Please try again.");
	            }
	        }
	}

}
