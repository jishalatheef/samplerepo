package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	
	{this.city=city;
	this.state=state;
	this.ref=ref;
		
	}
	public void display()

	{ 
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(ref.addr);
		System.out.println(city);
		System.out.println(state);
	}
	
	
	
public static void main(String[] args)
{
	
	Aggregation1 obj1=new Aggregation1("jisha",28,"tvm");
	Aggregation2 obj=new Aggregation2("tvm","kerala",obj1);// TODO Auto-generated method stub
	obj.display();
	
	
	}

}
