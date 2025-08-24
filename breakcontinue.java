public class breakcontinue {
    public static void main(String[] args) {
        int i;
        System.out.println("BREAK loop ====");
        for(i=0; i< 10 ; i++){
            if(i == 5)
            break;
            System.out.print(i  +"   ");
        }
        System.out.println();
        System.out.println(" continue loop===");
        for(i=0; i< 10 ; i++){
            if(i == 5)
            continue;
            System.out.print(i+"   ");
        }
    }
    
}