import java.util.Scanner;
public class simpcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simple Calculator

        double num1;
        double num2;
        char operator;
        double result;
        System.out.println("----Simple Calculator-----");

        System.out.println("Enter your 2 operands ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operation you want to perform ( + for addition , - for substraction  / for division * for multiplication)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> {
            result = num1 + num2;
            System.out.println(result);
            }
            case '-' -> { 
            result = num1 - num2;
        System.out.println(result);
    }
           case '*' -> { 
            result = num1 * num2;
        System.out.println(result);
    }
           case '/' -> { 
            result = num1 / num2;
        System.out.println(result);
    }
    default -> System.out.println("wrong operator");
    
        }
        sc.close();
    }
    
}
