package polymorphism;

public class Onseason {
	public void discount(int amnt)
	{
	int	dis=amnt*40/100;
	int total=amnt-dis;
	System.out.println("Purchased amount :"+amnt);
	System.out.println("On season 40% discount,amount to be paid after discount :"+total);
		
	}
	

}
