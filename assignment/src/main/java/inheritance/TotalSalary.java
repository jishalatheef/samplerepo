package inheritance;

public class TotalSalary extends Allowance {

	public void total()
	{
		int t=bp+hra+b-(pf+d);
		System.out.println("Basic pay = "+bp);
		System.out.println("Deduction ="+d);
		System.out.println("Bonus = "+b);
		System.out.println("House rent allowance ="+hra);
		System.out.println("Provident fund ="+pf);
		System.out.println("Total Salary is ="+t);
		
		
	}
	public static void main(String[] args) {
		
		TotalSalary obj=new TotalSalary();
		obj.basic(10000,1000,1500);
		obj.calculate();
		obj.total();
		
		
		
		// TODO Auto-generated method stub

	}

}
