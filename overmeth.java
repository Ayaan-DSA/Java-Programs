public class overmeth {
    public static void main(String[] args) {
     System.out.println(bakePizza("flat bread", "mozzarella ", "pepperoni"));   
    }
    static String bakePizza (String bread) {
        return bread + " " + "pizza";
    }
    static String bakePizza (String bread , String cheese) {
        return cheese + " " + bread + " " + "pizza";
    }
    static String bakePizza (String bread, String cheese , String topping) {
        return cheese +" "+ topping + "  "+ bread + " " + "pizza";
    }
    
    
}
