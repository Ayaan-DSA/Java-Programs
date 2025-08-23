import java.util.Scanner;
public class tempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // temperature converter
        double temp;
        double newTemp;
        String unit;
        System.out.println("----Temperature Converter");
        System.out.println("Enter the temperature");
        temp = sc.nextDouble();
        System.out.println("Conert into Fahrenheit or Celsius");
        unit = sc.next().toUpperCase();  // method chaining
       newTemp =  (unit.equals("C")) ? (temp -32) * 5/9 : (temp * 5/9) + 32;
       System.out.println("New temperature after converting is " + newTemp + "");
       sc.close();

    }
}
