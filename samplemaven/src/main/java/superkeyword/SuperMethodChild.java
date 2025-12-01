package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void child()
	{
		super.parent();
		System.out.println("From the child class");
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.child();
	
		
		// TODO Auto-generated method stub

	}

}
