import java.util.Scanner;

public class mathematics {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        double result;
        result = Math.pow(2, 3);
        double result1 = Math.abs(-5);
        double result2 = Math.sqrt(25);
        double result3 = Math.round(3.14);
        double result4 = Math.ceil(5.23);
        double result5 = Math.floor(2.98);
        double result6 = Math.max(25 , 89);
        System.out.println(result);
            System.out.println(result1);
                System.out.println(result2);
                    System.out.println(result3);
                        System.out.println(result4);
                            System.out.println(result5);
                                System.out.println(result6);
Scanner scan = new Scanner(System.in);
System.out.println("enter the base and height of triangle");
double a = scan.nextDouble();
double b = scan.nextDouble();
double c = Math.sqrt(Math.pow(a,2) + Math.pow(b , 2) );
System.out.println("hypotenuse is " + c);




scan.close();
   
                            }
}
