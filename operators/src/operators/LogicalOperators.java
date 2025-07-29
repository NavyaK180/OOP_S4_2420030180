package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if a student passed both theory and practical exams using logical AND.
		boolean theory = true;
		boolean practical = true;
		if(theory && practical)
			System.out.println("Student Passed in both");
		else
			System.out.println("Student didn't Passed in both: so he failed");
				
	}

	
}
