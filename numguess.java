import java.util.Random;
import java.util.Scanner;
public class numguess {
    public static void main(String[] args) {
        // Number guessing game
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        System.out.println("---Number Guessing game---");
        int number = random.nextInt(1, 11);
        do{
            attempts++;
            System.out.println("Enter the number");
            guess = sc.nextInt();

            if(guess < number){
                System.out.println("TOO LOW! try again");
            }
            
            if(guess > number){
                System.out.println("TOO HIGH! try again");

        }
          
    }while(guess != number);
    System.out.println("YOU WON!");
    System.out.println("attempts took =  "+attempts);
sc.close();
}
}