package rayene.bankaccount;


import java.util.*;

public class Demo {
    public static void main(String args[]) {
    	
    	
        String choice;
        BankAccount account = new BankAccount ();
        Scanner sc = new Scanner(System.in);
        double amount;
       
        do {
            System.out.println("1. make a deposit");
            System.out.println("2. make a withdrawal");
            System.out.println("3. show history");
            System.out.println("4. Exit");
            System.out.println("make a choice:");
            choice = sc.next();
            switch (choice) {

           
            case "1":

               System.out.println("enter Amount:");
               amount = sc.nextDouble();
               account.deposit(amount);
                break;

            case "2":
                
            	  System.out.println("enter Amount:");
                  amount = sc.nextDouble();
                  account.withdrawal(amount);
                break;
            case "3":

            case "4":
                System.out.println("Thank you for your visit");
                break;

            default:
                System.out.println("Wrong choice!");
            }
        } while (choice != "4");
        sc.close();
    }
}