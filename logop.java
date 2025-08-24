public class logop {
    public static void main(String[] args) {
        int temp = 20;
        boolean sunny = false;
        if ( temp <= 30 && temp > 0)  { // && operator
            System.out.println("The weather is good ");

        
        }
        if ( sunny != true ) { // ! operator
            System.out.println("weather is cloudy ");
        }
        if ( temp > 30 || temp < 0) { // || operator
            System.out.println("The weather is bad");
        }
    }
    
}
