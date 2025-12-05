package polymorphism;

public class Offseason extends Onseason {
	public void discount(int amnt)
	{
		int dis=amnt*15/100;
		int total=amnt-dis;
		System.out.println("Off Season 15% discount.Amount to be paid after discount :"+total);
	}

	public static void main(String[] args) {
		Onseason obj1=new Onseason();
		obj1.discount(5000);
		Offseason obj=new Offseason();
	
		obj.discount(5000);
		
		// TODO Auto-generated method stub

	}

}
