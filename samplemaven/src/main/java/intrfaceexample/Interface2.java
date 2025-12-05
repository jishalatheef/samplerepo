package intrfaceexample;

public class Interface2 implements Interface1 {
	

	public static void main(String[] args) {
		
		Interface2 obj=new Interface2();
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
