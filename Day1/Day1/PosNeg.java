import java.util.Scanner;
public class PosNeg {
   public static void main(String[] args) {
	int n;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number   ");
	n = sc.nextInt();
	if (n >= 0) {
	   System.out.println("Positive Number....");
	} else {
	   System.out.println("Negative Number...");
	}
   }
}