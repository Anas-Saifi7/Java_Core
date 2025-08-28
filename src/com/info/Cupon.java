package com.info;

public class Cupon {
  String cuponNumber;
  double total;
  
  public Cupon(){
  }
  
   public Cupon(String cuponNumber, double total) {
	this.cuponNumber = cuponNumber;
	this.total = total;
 }
  public String getCuponNumber() {
	return cuponNumber;
}
public void setCuponNumber(String cuponNumber) {
	this.cuponNumber = cuponNumber;
}
public double getTotal() {
	return total;
}
public void setAmount(double amount) {
	this.total = total;
}
  public void cuponProcessing() {
    if (cuponNumber.equalsIgnoreCase("GoldenCoupon") || cuponNumber.equalsIgnoreCase("StarCoupon") || cuponNumber.equalsIgnoreCase("Coupon50") || cuponNumber.equalsIgnoreCase("LuckyCoupon")) {
        double remainingAmount = total * 0.5;
        System.out.println("Congrats!! You got 50% discount on your total amount.");
        System.out.println("Remaining amount you have to pay is " + remainingAmount);
    } else if (cuponNumber.equalsIgnoreCase("SilverCoupon") || cuponNumber.equalsIgnoreCase("Coupon25") || cuponNumber.equalsIgnoreCase("Lucky25") || cuponNumber.equalsIgnoreCase("Star25")) {
        double remainingAmount = total * 0.25;
        System.out.println("Congrats!! You got 25% discount on your total amount.");
        System.out.println("Remaining amount you have to pay is " + remainingAmount);
    } else {
        System.out.println("Sorry!! seems you don't have any coupon..");
        System.out.println("Total amount you have to pay is " + total);
    }
}

}
