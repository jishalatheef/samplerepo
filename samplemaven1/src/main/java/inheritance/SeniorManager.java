package inheritance;

public class SeniorManager extends Manager {
int ta=500;
public void allownce()
{
	System.out.println("travel allowance is "+ta);
}
	public static void main(String[] args) {
		SeniorManager obj=new SeniorManager();
		obj.show();
		obj.base();
		obj.allownce();
		int total=obj.ta+obj.basesalary+obj.bonus;
		System.out.println("Total salary is "+total);
		
		
		
		// TODO Auto-generated method stub

	}

}
