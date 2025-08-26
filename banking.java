import java.util.Scanner;
public class banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    // JAVA BANKING PROGRAM using methods
    double bal = 10.99;
    boolean isRunning = true;
    int choice;
    
    while (isRunning == true){
System.out.println("*********");
    System.out.println("----Banking Program");
    System.out.println("*********");
    System.out.println("----1. Show Balance----");
    System.out.println("----2. Deposit----");
    System.out.println("----3. Withdraw----");
    System.out.println("----4. Exit----");
    System.out.println("**********");
    System.out.print("Enter your choice (1 ,2 ,3 ,4)  :  ");
     choice = sc.nextInt();
     switch(choice){
     case 1 -> showBalance(bal);
     case 2 -> bal = bal + deposit();
     case 3 -> bal = bal - withdraw(bal);
     case 4 -> isRunning = false;
      default -> System.out.println("Wrong choice!!   Try Again");
    }
}
}
static void showBalance(double bal) {
    System.out.println(bal);
}
static double deposit(){
    
    double amt;
    System.out.println("Enter the amount to be deposited");
amt = sc.nextDouble();
if(amt < 0){
    System.out.println("amount cant be negative");
    return 0;
}
else {
    return amt;
}

}
static double withdraw(double bal){
    double amt;
    System.out.println("Enter the amount to be withdrawn ");
    amt = sc.nextDouble();
    if (amt > bal) {
        System.out.println("Insufficient funds");
    return 0;
    }

    else if( amt < 0){
        System.out.println("amount cant be negative");
    return 0;
    }
    else return amt;


}
}