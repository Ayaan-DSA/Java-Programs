import java.util.Scanner;

public class inarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] food = new String[100] ;
        System.out.println("Enter the food items you want");
        for( int i = 0 ; i<5 ; i++){
            food[i] = sc.nextLine();
        }
    for( int i = 0 ; i<5 ; i++){
           System.out.println(food[i]); 
        }
        sc.close();
    }
}
