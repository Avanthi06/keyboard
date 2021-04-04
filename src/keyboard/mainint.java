/**
 * 
 */
package keyboard;

/**
 * @author rajan
 *
 */
	import java.util.Scanner;
	import java.lang.*; //We need to import this to use Integer

	public class mainint {

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String scanned = sc.next();  
	        int x = Integer.parseInt(scanned);

	        System.out.println("You typed: " + scanned); // This will print what the user typed in
	    }
	}

	
