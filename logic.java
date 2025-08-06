import java.util.Scanner;
public class logic {
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
   
 // AND(&&) operator

 System.out.println("enter a number to check divisbility by 6");
 int num = sc.nextInt();
 sc.nextLine();


 if(num % 2== 0 && num % 3 == 0){
    System.out.println("number is divisile by 6");

 }
 else {
    System.out.println("not divisible by 6");
 }
  
   // OR(||) operator
   System.out.println("you are playing a game ");
   System.out.println("press q or Q to exit");
String res = sc.nextLine();

if( res.equals("q") || res.equals("Q"))
System.out.println("Thanks for playing");
else 
System.out.println("continue playing");


// NOT(!) operator
   System.out.println("you are playing a game ");
   System.out.println("press q or Q to exit");
String response = sc.nextLine();
if( !response.equals("q") && !response.equals("Q"))
System.out.println("Keep playing the game");
else 
System.out.println("End game");

 sc.close();
}
}
