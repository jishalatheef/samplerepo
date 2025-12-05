package encapsulation;

public class Bank {
	private int pin;
	public void setpin(int pin)
	{ 
		this.pin=pin;
		
	}
	public void getpin()
	
	{
		if(pin==1001 || pin==1234 || pin==1212)
		{
		System.out.println("valid pin");
		}
		else
			System.out.println("invalid pin");
		
		
		
			
		}
		
	}


