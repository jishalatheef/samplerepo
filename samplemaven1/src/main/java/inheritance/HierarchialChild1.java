package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public void show()
	{
		System.out.println("From child1 class");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj=new HierarchialChild1();
		obj.display();
		obj.show();
		// TODO Auto-generated method stub

	}

}
