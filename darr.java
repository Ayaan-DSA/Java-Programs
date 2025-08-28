public class darr {
    public static void main(String[] args) {
            char[][] telephone = {{ '1' , '2' , '3'},
             {'4', '5', '6'},
              {'7', '8' , '9'},
               {'*', '0', '#'}};

            for( char[] num : telephone){
                for(char nums : num){

                    System.out.print(nums + "  ");
                }
                System.out.println();

            }
    }
    
}
