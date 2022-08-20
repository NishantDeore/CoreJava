import java.util.*;
public class method_overloading {
	void sum(int a,int b)
	{
		System.out.println("Sum is= "+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("Sum is= "+(a+b));
	}
	public static void main(String[] args)
	{
		method_overloading cal=new method_overloading();
		cal.sum(4, 5);
		cal.sum(5.3f, 6.1f);
	}
}
