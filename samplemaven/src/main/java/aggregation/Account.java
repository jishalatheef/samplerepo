package aggregation;

public class Account {
	int acctno;
	int balance;
	public Account(int acctno,int balance)
	{
		this.acctno=acctno;
		this.balance=balance;
		
	}
	public void deposit(int amnt)
	{
		balance=balance+amnt;
		System.out.println(balance);
	}
	public void withdraw(int amnt)
	{
		if(amnt>balance)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			balance=balance-amnt;
			System.out.println(balance);
		}
	
	}
	public void show()
	{
		System.out.println(balance);
	}
}
