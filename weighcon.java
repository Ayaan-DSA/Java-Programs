import java.util.Scanner;
public class weighcon {
    public static void main(String[] args) {
  // weight converter program
Scanner sc = new Scanner(System.in);
double weight;
double NewWeight;
int choice;
System.out.println("____Weight Converter_____");
System.out.println("1. To convert lbs into kg ");
System.out.println("2. To convert kg into lbs ");
System.out.println("____Enter your choice____");
choice = sc.nextInt();
if (choice == 1) {
    System.out.println("Enter the weight in lbs ");
    weight = sc.nextDouble();
      NewWeight = weight * 0.453592;

      System.out.println("New weight in kg is " + NewWeight + "kgs");
}
 else if ( choice == 2) {
System.out.println("Enter the weight in kgs ");
weight = sc.nextDouble();
NewWeight = weight *2.20462;
System.out.println("Weight in lbs is " + NewWeight + "lbs");

}
else {
    System.out.println("invalid choice");

}
sc.close();
}
    
}
