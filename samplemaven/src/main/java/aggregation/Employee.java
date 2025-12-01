package aggregation;

public class Employee {
	String s;
	int salary;
	Company ref;
	
	public Employee(String s,int salary,Company ref)
	{
this.s=s;
this.salary=salary;
this.ref=ref;

	}
public void display()
{
	System.out.println(ref.name);
	System.out.println(s);
	System.out.println(salary);
}
	public static void main(String[] args) {
		Company obj=new Company("infosys");
	Employee obj1=new Employee("jisha",50000,obj);	
	obj1.display();// TODO Auto-generated method stub

	}

}
