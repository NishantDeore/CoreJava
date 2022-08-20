
public class callbyreference {
	int x=10;
	int y=20;
	public void callbyref(callbyreference t)
	{
		t.x=100;
		t.y=200;
	}
	public static void main(String[] args)
	{
		callbyreference ts=new callbyreference();
		System.out.println("before "+ts.x+" "+ts.y);
		ts.callbyref(ts);
		System.out.println("after "+ts.x+" "+ts.y);
	}
}
