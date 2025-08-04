import java.util.Scanner;
public class ifstate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        if (age <18) 
        System.out.println("you are teenager");

        if (age >= 18)
        System.out.println("you are an adult");
        scan.close();


       }
}
