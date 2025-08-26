import java.util.Random;
import java.util.Scanner;

public class diceroll {
    public static void main(String[] args) {
        // JAVA DICE ROLLING PROGRAM
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
int NumOfDice ;
int total = 0;

System.out.println("Enter the number of dice to roll");
NumOfDice = sc.nextInt();
if (NumOfDice > 0){
    for(int i =0; i <NumOfDice ; i++){
        int roll = random.nextInt(1,7);
        System.out.println("You have rolled " + roll);
        printdie(roll);
        total += roll;

    }
System.out.println("Total =" + total);
}
else {
    System.out.println("number of dice should be more then 0");
}
}
static void printdie(int roll){
    String dice1 = """
              -------
             |       |
             |   ●   |
             |       |
              ------- 
            """;
            String dice2 = """
              -------
             | ●     |
             |       |
             |     ● |
              ------- 
            """;
            String dice3 = """
              -------
             | ●     |
             |   ●   |
             |     ● |
              ------- 
            """;
            String dice4 = """
              -------
             | ●   ● |
             |       |
             | ●   ● |
              ------- 
            """;
            String dice5 = """
              -------
             | ●   ● |
             |   ●   |
             | ●   ● |
              ------- 
            """;
            String dice6 = """
              -------
             | ●   ● |
             | ●   ● |
             | ●   ● |
              ------- 
            """;
            switch (roll) {
            case 1 -> System.out.println(dice1);    
            case 2 -> System.out.println(dice2);    
            case 3 -> System.out.println(dice3);    
            case 4 -> System.out.println(dice4);    
            case 5 -> System.out.println(dice5);    
            case 6 -> System.out.println(dice6);    
        default -> System.out.println("Invalid roll");    
        }
}
}