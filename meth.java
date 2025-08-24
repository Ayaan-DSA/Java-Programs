public class meth {
    public static void main(String[] args) {
        int age = 20;
        String first = "Ayaan";
        String last = "Khan";
        int num = 5;
        int sqr = square(num);
System.out.println(sqr);
        String name = fullname(first , last);
        System.out.println(name);
        if(agecheck(age)){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("you are not eligible");
        }
    }
    //Methods

    static int square ( int a) {
        return a * a;
    }
    static String fullname ( String first ,String last) {
        return first  +" " + last;

    }
    static boolean agecheck( int age) {
        if (age >=18){
            return true;

        }
        else {
            return false;
        }
    }
    
}
