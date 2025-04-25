/*A bank wants to develop a system to manage customer accounts. Each acc has a unique account number, an account holder's name and a balance
 Customers can deposit, withdraw money from their accounts and check their balance.*/
// 4th period: 1.05 to 2.00 PM
// 5th period: 2.00 to 2.55 PM
// 6th period: 2.55 to 3.50 PM

import java.util.*;

public class Customer {
    private int accountNumber;
    public String name;
    private float balance;

    Customer() {
        accountNumber = 1000;
        name = "Daniel";
        balance = 100.0f;
    }

    void deposit(int amount){
        balance=balance+amount;
        System.out.println("After Depositing, the balance is: " + balance);
    }

    void withdraw(int amount){
        if(amount > balance){
            System.out.println("insufficient Balance.");
        }
        else{
            balance=balance-amount;
            System.out.println("The money to be withdrawn is: "+amount);
            System.out.println("The current balance after withdrawing is:"+balance);
        }
    }

    void checkBalance(){
        System.out.println("The current balance is:"+balance);
    }

    public static void main(String[] args){
        Customer c1=new Customer();
        // c1.deposit(1000);
        // c1.withdraw(200);
        // c1.checkBalance();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select one of the below services: ");
        while(true){
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int opt=sc.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Enter the amount to be deposited:");
                    int depositAmount=sc.nextInt();
                    c1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn: ");
                    int withdrawAmount=sc.nextInt();
                    c1.withdraw(withdrawAmount);
                    break;
                case 3:
                    c1.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                }
    }
}
}
