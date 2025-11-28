package inheritance;

public class ChildC extends ParentB{
	public void display()
	{
		System.out.println("from class C");
	}

	public static void main(String[] args) {
		ChildC obj=new ChildC();
		obj.show();
		obj.print();
		obj.display();// TODO Auto-generated method stub

	}

}
