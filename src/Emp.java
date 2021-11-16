import java.util.Scanner;
import java.util.regex.Matcher;

public class Emp {
    public static void main(String[] args) {

String domain;
String deptt,sal;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your Salary");
sal= sc.next();

        System.out.print("Input your domain");
        domain  = sc.next();

        System.out.print("Input your department");
        deptt = sc.next();

try  {

    if (domain.matches("Consulting") && deptt.matches("CSE") && sal.matches("\\d{5}")) {
        System.out.println("Designation : Junior");
    } else if (domain.matches("audit") && deptt.matches("taxation") && sal.matches("\\d{6}")) {
        System.out.println("Designation : Senior");
    } else if (domain.matches("Tech") && deptt.matches("CSE") && sal.matches("\\d{5}")) {
        System.out.println("Designation : Associate");
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




