import java.util.Scanner;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Assignment4 {
    public static void main(String[] args) {

        String contactno,email;


        Scanner sc = new Scanner(System.in);

        System.out.print("Input your contactno");
        contactno= sc.next();

        System.out.print("Input your email");
        email  = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";


        try  {

            if (contactno.matches("\\d{10}") && email.matches(regex)){
                System.out.println("VALID");
            } else if (contactno.matches("\\(\\d{3}\\)\\d{7}") && email.matches(regex)) {
                System.out.println("VALID");
            } else if (contactno.matches("\\d{3}-\\d{3}-\\d{4}") && email.matches(regex)) {
                System.out.println("VALID");
            }
            else {
                throw new Exception("designation NOT FOUND");
                // System.out.println("NOT FOUND");
            }

        }

        catch (Exception e){
            System.out.println( e.getMessage());
        }


    }
}




