import java.util.Scanner;
public class whiloop {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    
    System.out.println("Enter your age");
     int age = sc.nextInt();
        while(age < 0) { 
      System.out.println("Your age cant be negative");
      System.out.println("Enter your age");
      age = sc.nextInt();  
    }
    
System.out.println("your age is   " + age);
sc.close();
    
 }    
}
