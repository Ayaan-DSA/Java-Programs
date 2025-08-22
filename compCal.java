import java.util.Scanner;

public class compCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double principal ;
        double rate;
        int timescompounded;
        int years;
        double amt;
        System.out.println("Enter the principal amount :");
        principal = sc.nextDouble();
        System.out.println("enter the interest rate (in %) :");
        rate = sc.nextDouble() / 100;
        System.out.println("enter the number of times compounded :");  
        timescompounded = sc.nextInt();
        System.out.println("enter the number of years");
        years = sc.nextInt();
        amt = principal * Math.pow((1 + (rate /timescompounded) ), timescompounded * years);
        System.out.println("The amount after" + years + "is $"+ amt);
sc.close();
    }
    
}
