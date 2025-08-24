public class forloop {
    public static void main(String[] args) throws InterruptedException { // throws InterruptedException is for time control 
        int start = 10;
        for( int i = start; i> 0 ; i--){

            System.out.println(i);
            Thread.sleep(1000); // Thread.sleep(how many milli seconds); time control
        }
        System.out.println("Happy new year!!");
    }
    
}
