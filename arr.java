public class arr {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana" , "orange"};
       for( int i = 0 ; i<fruits.length; i++){
        System.out.println(fruits[i]);

       }
       for (String fruit : fruits){ // another way to output
        System.out.println(fruit);

       }
System.out.println(fruits.length);
    }
}
