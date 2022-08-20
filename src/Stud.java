import java.util.*;

class student
{
	private
		
		int rollno;
		String name;
		double marks;
		
	public
	
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll no: ");
			rollno=sc.nextInt();
			System.out.println("Enter name: ");
			name=sc.next();
			System.out.println("Enter marks: ");
			marks=sc.nextDouble();
		}
		void display()
		{
			System.out.println("Roll no= "+rollno);
			System.out.println("Name= "+name);
			System.out.println("Marks= "+marks);
		}
}
public class Stud {
	public static void main(String[] args)
	{
		student s1=new student();
		s1.accept();
		s1.display();
	}

}
