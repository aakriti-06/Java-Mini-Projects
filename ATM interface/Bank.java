import java.util.Scanner;
class Bank{
 public static void main(String []args){
 int id,pin,accountno,choice = 0;
 double s,t,withdraw=0,deposit=0,history,transfer,w,d,amount = 100000;
 Scanner sc = new Scanner(System.in);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
 System.out.println("Enter id : ");
id = sc.nextInt();
if(id!=1){
System.out.println("Try again");
}
else{System.out.println("Successful login");
}
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("Enter pin : ");
 pin = sc.nextInt();
if(pin!=5000){
System.out.println("Try again");
}
else{
System.out.println("Successful login");
}
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
 System.out.println("\n1. Withdraw\n2. Deposit\n3. Transfer\n4. Transaction History\n5. Quit\nEnter Your choice : ");
 choice = sc.nextInt();
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
 switch(choice){
 case 1 : {System.out.println("Enter how much money you want to withdraw : ");
 withdraw = sc.nextDouble();
 w = amount - withdraw;
 System.out.println("Amount left after withdrawn: Rs" + w);
 }break;
 case 2 : {System.out.println("Enter how much money you want to deposit : ");
 deposit = sc.nextDouble();
 d = amount + deposit;
 System.out.println("Total amount after deposit : Rs" + d);
}break;
 case 3 : {System.out.println("Enter account no of the bank account you want to transfer money(10 digits) : ");
 accountno = sc.nextInt();
 System.out.println("Completed! Now you are allowed to transfer money to the desired account");
 System.out.println("Enter how much money you want to transfer : Rs");
 transfer = sc.nextDouble();
 t = amount - transfer;
 System.out.println("Operation Completed Sucessfully! Money Transferred");
 System.out.println("Money deposited to the account no " + accountno + " is Rs" + transfer);
 System.out.println("Left amount after deduction : Rs" + t);
}break;
case 4 : {System.out.println("Transaction History is as follows for the most recent operations done : ");
System.out.println("Enter Amount you deposited : " );
deposit = sc.nextDouble();
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("Enter Amount you withdrawn : " );
withdraw = sc.nextDouble();
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("Deposited Amount : Rs" + deposit);
System.out.println("Withdrawn Amount : Rs" + withdraw);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
s = amount + deposit - withdraw;
System.out.println("AMOUNT BEFORE THE OPERATIONS DONE : Rs" + amount);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------
--------------------");
System.out.println("AMOUNT AFTER THE OPERATIONS DONE : Rs" + s);
}break;
 default : System.out.println("Logged Off");
}
System.out.println("Thanks for taking our service!");
}}
