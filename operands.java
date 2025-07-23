import java.util.Scanner;

public class operands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
       
        System.out.println("Enter 2 numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int pro = num1 * num2;
        int d = num1 / num2;
        System.out.println("sum of 2 numbers " + sum + " difference = "+ diff + " product = "+ pro + " divide = "+ d);

    }
}
