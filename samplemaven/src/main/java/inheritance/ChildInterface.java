package inheritance;

public class ChildInterface implements MultipleParent1,MultipleParent2 {

	public static void main(String[] args) {
		
		ChildInterface obj=new ChildInterface();
		obj.display();
		obj.show();
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
