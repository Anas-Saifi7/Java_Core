package com.info;
import java.util.Scanner;

public class SalesCommision {

    public static float calcComm(double montSale) {
        double commisionAmount;
        if (montSale < 50000) {
            return -1;
        } else if (montSale >= 50000 && montSale <= 100000) {
            commisionAmount=  (montSale * 0.01);
        } else if (montSale >= 100001 && montSale <= 200000) {
            commisionAmount = (montSale * 0.025);
        } else if (montSale >= 200001 && montSale <= 300000) {
            commisionAmount = (montSale * 0.038);
        } else if (montSale >= 300001 && montSale <= 400000) {
            commisionAmount =  (montSale * 0.042);
        } else {
            commisionAmount =  (montSale * 0.055);
        }
         return  (float) commisionAmount;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.print("Sales Executive id:");
        int SalesId = sc.nextInt();
        sc.nextLine();
        System.out.print("Name:");
        String Name = sc.nextLine();
        System.out.print("Monthly sales amount:");
        double montSale = sc.nextDouble();

        double commisionAmount =  calcComm(montSale);
        double fixedSalary = 10000.00;
        String commisionOffered;

        if (commisionAmount == -1){
            commisionOffered = "Please provide justification for low sales";
            commisionAmount = 0.00;
        } else {
            commisionOffered = String.format("%.1f%%", (commisionAmount / montSale) * 100);
        }
        double netAmountPaid = fixedSalary + commisionAmount;

        System.out.println("\nSales Executive Salary details");

        System.out.println("Sales Executive id:" + SalesId);
        System.out.println("Name:" + Name);
        System.out.println("Monthly sales amount:" + montSale);
        System.out.println("Commission offered:" +   commisionOffered);
        System.out.println("Fixed salary Sales Executive:" + fixedSalary);
        System.out.println("Sales Executive Commission amount:" + commisionAmount);
        System.out.println("Net Amount Paid to Sales Executive :" + netAmountPaid);

    }

}
