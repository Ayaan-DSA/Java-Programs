public class nestif {
 public static void main(String[] args) {
boolean isStudent = true;
boolean isSenior = true;
double price = 9.99;

if( isStudent) {
    if(isSenior) {
System.out.println("You get a student discount of 10%");
System.out.println("you will get a additional discount of 20%");

price = price *0.7;
    }
    else {
        price *= 0.9;
    }
}
else {
    price *= 1;
}
   System.out.println("The price of ticket is  " + price);


}}