package aggregation;

public class Customer {
	String name;
	Account ref;
	public Customer(String name,Account ref)
	{
		this.name=name;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(ref.acctno);
		ref.deposit(1000);
		ref.withdraw(2000);
		ref.show();
		System.out.println();
		
	}

	public static void main(String[] args) {
		Account obj=new Account(123,20000);
		Customer obj1=new Customer("jisha",obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
