import java.util.*;
class area
{

	private
		int len,bre,area;
	
	public
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter lenght= ");
			len=sc.nextInt();
			System.out.println("Enter breadth= ");
			bre=sc.nextInt();
		}
		void display()
		{
			area=len*bre;
			System.out.println("Area of recctangle= "+area);
		}
}	
public class Rectangle {
	public static void main(String[] args)
	{
//		area a=new area();
//		a.accept();
//		a.display();
		
		area[] r1=new area[3];
		for(int i=0;i<=2;i++)
		{
			r1[i]=new area();
		}
		for(int i=0;i<=2;i++)
		{
			r1[i].accept();
		}
		for(int i=0;i<=2;i++)
		{
			r1[i].display();
		}
		
//		for(area x:r1)
//		{
//			System.out.println(x);
//		}
	}

}
