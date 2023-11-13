import java.util.Scanner;
public class Scan1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String firstName, lastName;
	System.out.println("Enter Your FirstName  ");
	firstName = sc.next();
	System.out.println("Enter Your LastName  ");
	lastName = sc.next();
	System.out.println("FirstName is  " +firstName);
	System.out.println("LastName is  " +lastName);
    }
}