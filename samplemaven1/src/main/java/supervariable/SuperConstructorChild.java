package supervariable;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()

	{super(5,10);
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		// TODO Auto-generated method stub

	}

}
