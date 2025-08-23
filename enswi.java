
public class enswi {
public static void main(String[] args) {
    String day = "Monday";

    switch (day) {
        case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" -> System.out.println("Its a weekday");
        
        case "Saturday" -> System.out.println("Weekend");
        case "Sunday" -> System.out.println("Weekend");
    }
    
}    
}
