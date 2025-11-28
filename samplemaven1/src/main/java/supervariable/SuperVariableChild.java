package supervariable;

public class SuperVariableChild extends SuperVariableParent{

	String s="black";
	public void display()
	{
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		SuperVariableChild	obj=new SuperVariableChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
