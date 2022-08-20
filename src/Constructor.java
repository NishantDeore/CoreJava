
import java.util.*;

class cricketer
{
	String name;
	String team;
	int age;
	
	public
		cricketer()    //default constructor
		{
			name=" ";
			team=" ";
			age=0;
		}
		cricketer(String n,String t,int a)    //parameterized constructor
		{
			name=n;
			team=t;
			age=a;
		}
		
		cricketer(String name,int age)    //this constructor
		{
			this.name=name;
			this.age=age;
		}
		
		cricketer(cricketer ckt)   //copy constructor
		{
			name=ckt.name;
			team=ckt.team;
			age=ckt.age;
		}
		public String toString()
		
		{
			return "name="+name +"team="+team +"age= "+age;
		}
}
public class Constructor {
	public static void main(String[] args)
	{
		cricketer c1=new cricketer();
		cricketer c2=new cricketer("Sachin ","India ",45);
		cricketer c3=new cricketer(c2 );
		cricketer c4=new cricketer("Dhoni ",40);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c1.name="Virat ";
		c1.team="India ";
		c1.age=32;
		System.out.println(c1);
	}
}
