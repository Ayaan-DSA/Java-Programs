
import java.util.Scanner;

public class quiz {
public static void main(String[] args) {
    // JAVA QUIZ GAME
    String[] ques = { "What is the colour of apple?", " How many continents are there?" , "What is the powerhouse of the cell"};
    String [] [] opts = {{" 1. Green", "2. Red","3. Yellow", "4. Orange" },
                         {"1. 8", "2. 4", "3. 7","4. 1"},
                         {"1. Mitochondria", "2. Nucleus", ". Plasma","4. Ribosomes"}};
   int[] answers = { 2 , 3 , 1};
   int score = 0;
   int guess;
   Scanner sc = new Scanner(System.in);
   System.out.println("**************");
   System.out.println("----WELCOME TO THE QUIZ----");
   System.out.println("**************");
   for(int i = 0 ; i < ques.length; i++){
    System.out.println(ques[i]);
    for( String a : opts[i]){
          System.out.println(a);
    }
    System.out.print("Enter your answer :");
    guess = sc.nextInt();
    if(guess == answers[i]){
        System.out.println("********");
        System.out.println("CORRECT!!!");
   score++;
        System.out.println("********");
    }
    else{
        System.out.println("********");
        System.out.println("WRONG!!!");
        System.out.println("********");
    }

    }
    System.out.println("Your final score is " + score + " out of " + ques.length);
    sc.close();
   }
}    

