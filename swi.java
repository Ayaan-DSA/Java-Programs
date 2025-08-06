import java.util.Scanner ;

public class swi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.println("enter a day of the week");
        day = sc.nextLine();

        switch(day) {
            case "Sunday" : System.out.println("it is Sunday");
            break;
            case "Monday" : System.out.println("it is Monday");
            break;
            case "Wednesday" : System.out.println("it is Wednesday");
            break;
            case "Thursday" : System.out.println("it is Thursday");
            break;
            case "Friday" : System.out.println("it is Friday");
            break;
            case "Saturday" : System.out.println("it is Saturday");
            break;
            

        }
sc.close();

        
    }
    
}
