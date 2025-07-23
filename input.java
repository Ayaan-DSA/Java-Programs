import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name ");
        String name = scan.nextLine();
        System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println("enter your 12th percentage");
        double perc = scan.nextDouble();

        System.out.println("Name = " + name);
        System.out.println("age = " + age);
        System.out.println("percentage = " + perc);
         
    }
}
