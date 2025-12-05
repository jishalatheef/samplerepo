package exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws VotingException {
		int age=15;
		if (age>=18)
		{
			System.out.println("eligible for voting");
			
		}
		else
		
			throw new VotingException("age under 18");
		
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	}

}
