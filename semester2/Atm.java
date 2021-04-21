import java.util.Scanner;

public class Atm {

    double balance = 100000;
    double amount;
    String account = "1233455";
    int pin = 1234;
    int input = 0;

    public double withdraw(double amt) {

        if (amt < 1) {
            System.out.println("invalid amount");
            return 0;
        }
        if (amt > balance) {
            System.out.println("not enough cash");
            return 0;
        }
        this.balance = this.balance - amt;
        System.out.println("you have withdrawn Rs " + this.amount);
        System.out.println("you have Rs " + this.balance + " balance");
        return this.balance;

    }

    public boolean ispincorrect() {
        if (this.input == 0) {
            return false;
        }
        if (this.input == pin) {
            System.out.println("welcome " + this.account);
            System.out.println("you have  Rs " + this.balance + " balance");
            return true;
        } else {
            System.out.println("incorrect pin");
            return false;
        }
    }

    public void enterpin() {
        System.out.println("enter pin");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        this.input = input;

    }

    public void enteramount() {
        System.out.println("enter amount");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        this.amount = input;
    }

    public void printbalance()
    {
        System.out.println("Nabil Bank Ltd");
        System.out.println("Balance : Rs"+this.balance);
    }

    public static void main(String[] aroon) {
        Atm ob = new Atm();
        String ch = "";
        do {
            System.out.println("welcome to nabil bank");
            while (ob.ispincorrect() == false) {
                ob.enterpin();
            }
            int choice;
            System.out.println("press 1 for balance check press 2 for withdrawl");
            Scanner sc= new  Scanner(System.in);
            choice=sc.nextInt();
            if(choice==1)
            {
                ob.printbalance();
            }
            else{
            ob.enteramount();
            ob.withdraw(ob.amount);
            }
            sc=new Scanner(System.in);
            System.out.println("do you want to continue (press any key) or press 'q' to quit");
            ch=sc.next();
        } while (!ch.equals("q")); // ch!='s'
if(ch.equals("q"))
{
    System.out.println("thank you bye bye");
    System.out.println("nabil bank ltd Thamel Branch ATM");
}
    }
}