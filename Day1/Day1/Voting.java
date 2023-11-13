import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age;
	System.out.println("Enter Age   ");
	age = sc.nextInt();
	if (age >= 18) {
	   System.out.println("You are Elligible for Voting...");
	} else {
	   System.out.println("You Cannot Vote...");
	}
    }
}