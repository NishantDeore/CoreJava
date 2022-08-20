
public class callbyvalue {
	public void callbyval (int a)
	{
		a=100;
	}
	public static void main(String[] args)
	{
		int a=50;
		callbyvalue c=new callbyvalue();
		c.callbyval(a);
		System.out.println(a);
	}

}
