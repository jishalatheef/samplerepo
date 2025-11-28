package inheritance;

public class HierarchialChild2 extends HierarchialParent{
	public void print()
	{
		System.out.println("from child2 class");
	}

	public static void main(String[] args) {
		
		HierarchialChild2 obj1=new HierarchialChild2();
		obj1.display();
		obj1.print();
		// TODO Auto-generated method stub

	}

}
