import java.util.Scanner;
public class sub {
    public static void main(String[] args) {
        String email;
        String username;
        String domain;
Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ");
        email = sc.nextLine();
        username = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        if(email.contains("@")) {
            System.out.println(username);
            System.out.println(domain);
            sc.close();
        }

    }
    
}
