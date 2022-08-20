import java.util.*;

class car
{
	private
	
		int modelno;
		String name;
		double price;
		
	public
		 void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter model no: ");
			modelno=sc.nextInt();
			System.out.println("ENter name= ");
			name=sc.next();
			System.out.println("Enter price= ");
			price=sc.nextDouble();
	}
		void display()
		{
			System.out.println("Model no= "+modelno);
			System.out.println("NAMe= "+name);
			System.out.println("price= "+price);
		}
}
public class vehicle {
	public static void main(String[] args)
	{
		car c=new car();
		c.accept();
		c.display();
	}

}
