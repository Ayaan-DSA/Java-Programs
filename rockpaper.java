
import java.util.Random;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
        // ROCK PAPER SCISSOR
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices= { "paper", "rock", "scissors"};
        String userChoice;
        String compChoice;
        String play = " yes";
     
        System.out.println("---ROCK PAPER SCISSORS---");

        System.out.print("Enter your choice  :");
        userChoice = sc.nextLine().toLowerCase();
        compChoice = choices[rand.nextInt(3)];
        System.out.println("The Computer choice is  " + compChoice);
        if (userChoice.equals(compChoice)) {
            System.out.println("ITS A TIE");
            
        }
      else if (userChoice.equals("rock") && compChoice.equals("scissor") ||userChoice.equals("scissor") && compChoice.equals("paper") || userChoice.equals("paper") && compChoice.equals("rock") ) {
          System.out.println("YOU WIN !!!");
      }
      else { System.out.println("YOU LOSE");}
    

    }
    
}
