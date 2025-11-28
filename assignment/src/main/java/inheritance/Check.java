package inheritance;

public class Check extends Addition {
	public void show()
	{
		super.add();
		if(t%10==0)
		{
			System.out.println(t+"divisible by 10");
		}
		else
			System.out.println(t+"Not divisible by 10");
	}

	public static void main(String[] args) {
		Check obj=new Check();
		obj.show();
		
		
		// TODO Auto-generated method stub

	}

}
