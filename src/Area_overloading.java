import java.util.*;
public class Area_overloading {
	void find(long l,long b)
	{
		System.out.println("Area is= "+(l*b));
	}
	void find(int l,int b,int h)
	{
		System.out.println("Area is= "+(l*b*h));
	}
	public static void main(String[] args)
	{
		Area_overloading ar=new Area_overloading();
		ar.find(4, 5);
		ar.find(5, 7, 2);
	}
}
