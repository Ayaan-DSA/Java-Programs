
import java.util.Random;
import java.util.Scanner;

public class slot {
    public static void main(String[] args) {
        // SLOT MACHINE
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;
        System.out.println("*******************************");
        System.out.println("---WELCOME TO JAVA SLOT---");
        System.out.println("        1 4 8 7    ");
        System.out.println("*******************************");
        while(balance > 0){
            System.out.println("Your current balance is $ "+ balance);
            System.out.print("Enter your bet amount  ");
            bet = sc.nextInt();
            sc.nextLine();
            if(bet > balance){
                System.out.println("Insufficient Funds");
                continue;

            }
            else if(bet <= 0){
                System.out.println("Bet must be greater then 0");
            continue;
            }
            else {
                balance -= bet;
            }
            System.out.println("Spinning...");
            row =  spinRow();
            printRow(row);
            payout = getPayOut(row , bet);
            if ( payout > 0){
               System.out.println("You won $  " + payout);
           
            } 
            else {
                System.out.println("Sorry You lost this round");
            }  
         System.out.print("Do you want to play again(y for yes/ n for no)  ");
         playAgain = sc.nextLine().toLowerCase();
         if(!playAgain.equals("y")){
            break;
         }   
        }
        System.out.println("*******************");
            System.out.println("Game Over");
            System.out.println("your final balance is  "+ balance);
            System.out.println("*******************");
            sc.close();
        }
        
        static String[] spinRow(){
            String[] num = {"1 " , "4" , "7", "8"};
            String[] row = new String[3];
            Random rand = new Random();
            
            for (int i = 0 ; i<3; i++) {
                row[i] = num[rand.nextInt(0,4)];
            }    
            
            
            return row;
        }
        static void printRow(String[] row){
         System.out.println("**************");
         System.out.println(" " + String.join(" | ", row) );
         System.out.println("**************");
        }
      static int getPayOut(String[] row , int bet) {
          if(row[0].equals(row[1]) && row[0].equals(row[2])){
            return switch(row[0]){
                case  "1" -> bet * 3;
                case  "4" -> bet * 5;
                case  "7" -> bet * 20;
                case  "8" -> bet * 10;
                default -> 0;
            };
          }
        return 0;

      }
}
