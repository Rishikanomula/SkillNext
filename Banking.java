import java.util.ArrayList;
public class Banking {
    int id;
    String name;
    double balance;

    Banking(int id,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
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

    public static void main(String[] args) {
        ArrayList<Banking> customers = new ArrayList<>();
        customers.add(new Banking(101,"Kiki",1000));
        customers.add(new Banking(102,"Ram",2500));
        customers.add(new Banking(103,"Kai",500));
        customers.add(new Banking(104,"Risi",2000)); 

    }
}
