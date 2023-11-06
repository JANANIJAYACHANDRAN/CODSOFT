/*By Janani*/
import java.util.*;
public class ATM
{
    public static void main(String[]args)
    {
       int PIN=1234;
       int balance=10000;
       int deposit =0;
       int withdraw=0;
       String name ;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your pin");
       int PWD= sc.nextInt();
       if(PWD==PIN)
       {
        System.out.println("Enter your Name");
        name= sc.next();
        System.out.println("Welcome "+name);
        while(true)
        {
            System.out.println("Press 1 to Check balance");
            System.out.println("Press 2 to Deposit amount");
            System.out.println("Press 3 to Withdraw amount");
            System.out.println("Press 4 Print Recipt");
            System.out.println("Press 5 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Your current balance:"+ balance);
                    
                    break;
                case 2:
                System.out.println("Enter amount you want Deposit");
                deposit= sc.nextInt();
                System.out.println("Sucessfully Deposited");
                balance+=deposit;
                break;
                case 3:
                System.out.println("Enter amount you want to Withdraw");
                withdraw=sc.nextInt();
                if(withdraw>balance)
                {
                    System.out.println("Insufficient balance");

                }
                else
                {
                    System.out.println("Succesfully withdrawn");
                    balance-=withdraw;

                }
                break;
                case 4:
                System.out.println("Welcome to our Bank!");
                System.out.println("Available Balance:"+ balance);
                System.out.println("Amount Deposited :"+ deposit );
                System.out.println("Amount WithDrawn : "+ withdraw);
                System.out.println("Thank You  "+ name);
                
        
            }

        }

       }
       else{
        System.out.println("Enter a valid PIN");
       }
       sc.close();
    }


    
}

