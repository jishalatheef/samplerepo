package aggregation;

public class Address {
	String addr;
	Student ref;
	public Address(String addr,Student ref)
	{this.ref=ref;
		this.addr=addr;
	}
	public void show()
	
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(addr);
		
	}


	public static void main(String[] args) {
		Student obj=new Student("jisha",38);
		
		Address obj1=new Address("tvm",obj);
		obj1.show();
		// TODO Auto-generated method stub

	}

}
