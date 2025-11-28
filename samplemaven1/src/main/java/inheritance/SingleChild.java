package inheritance;

public class SingleChild extends SingleParent{
	public void show()
	{
		System.out.println("From the child class");
	}

	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.display();
		obj.show();
		
		// TODO Auto-generated method stub

	}

}
