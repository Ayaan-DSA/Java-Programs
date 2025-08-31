
import java.util.Random;
import java.util.Scanner;

public class calloops {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
        car c = new car();
System.out.println(c.isRunning);
c.start();
System.out.println(c.isRunning);
c.stop();
System.out.println(c.isRunning);
    }
    
}
