package exceptionhandling;

public class Throwexample {

	public static void main(String[] args) {
		int age=15;
		if (age>=18)
		{
			System.out.println("eligible for voting");
			
		}
		else
		
			throw new NumberFormatException("age under 18");
		
		// TODO Auto-generated method stub

	}
}


