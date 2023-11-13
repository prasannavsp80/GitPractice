public class Test {
   public static void main(String[] args) {	
	int i=12;
	System.out.println(i++);
	// The above code returns 12 as its post increment as in 
	//current stage value retains 12 only
        i=12;
        System.out.println(++i);
        // The above code returns 13 as its pre increment as in
	// current statge only the value updated to 13 
   }
}