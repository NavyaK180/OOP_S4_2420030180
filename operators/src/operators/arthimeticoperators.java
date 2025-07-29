package operators;

import java.util.*;

public class arthimeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Perform addition, subtraction, multiplication, division, and modulus of two numbers
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = a+b;
	    System.out.println("The sum of " +a+ " and " +b+ " is " +c);
	    int d = a-b;
	    System.out.println("The difference of " +a+ " and " +b+ " is " +d);
	    int x= a*b;
	    System.out.println("The product of " +a+ " and " +b+ " is " +x);
	    int k = a/b;
	    System.out.println("The quotient of " +a+ " and " +b+ " is " +k);
	    int p = a%b;
	    System.out.println("The remainder of " +a+ " and " +b+ " is " +p);
	}

}
