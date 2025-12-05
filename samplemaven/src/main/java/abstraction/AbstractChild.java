package abstraction;

public class AbstractChild extends AbstractParent{
	

	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.show();
		obj.print();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("welcome");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

}
