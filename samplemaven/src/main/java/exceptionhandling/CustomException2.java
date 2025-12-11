package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws LicenseException {
		int a=13;
		if(a>=18)
		{
			System.out.println("eligible for license");
		}
		else
		{
			throw new LicenseException("age under 18");
			
		}
		// TODO Auto-generated method stub

	}

}
