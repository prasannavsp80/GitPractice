import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	System.out.println("Enter 2 Numbers   ");
	a = sc.nextInt();
        b = sc.nextInt();
	c = a + b;
	System.out.println("Sum is   " +c);
    }
}