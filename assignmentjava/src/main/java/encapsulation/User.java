package encapsulation;
import java.util.Scanner;


public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin");
		int n=sc.nextInt();
		
	
		Bank obj=new Bank();
		
		obj.setpin(n);
		obj.getpin();
		// TODO Auto-generated method stub

	}

}
