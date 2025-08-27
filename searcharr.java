import java.util.Scanner;
public class searcharr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int arr[] = { 1 , 2 ,3 , 4, 5};
     int a;
     boolean isTrue = false;
     System.out.println("ENter the number to be searched");
     a = sc.nextInt();
     for(int i = 0 ; i< arr.length ; i ++){
        if(arr[i] == a){
         isTrue = true;
        } 
     }
     if( isTrue == true){
        System.out.println("Number found");
     }
     else {
        System.out.println("Not found");
     }
    }
    
}
