
//import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

public class practice{
	int x=10;
	static int y=20;
	//static int MAX_VALUE=999;
	public static void main(String [] args){
		
		
		System.out.println(MAX_VALUE);
		
		//System.out.println("Hello shamim");
		//practice p=new practice();
		//p.m2(20,30);
		//p.m2(10,20,30,40);
		//System.out.println(p.x);
		
		//p.m1();
		//System.out.println(y);
		
		
		
		
	}
	public void m1(){
			System.out.println(x);
			System.out.println(y);
			
		}
	public void m2(int... x){
		int total=0;
		for (int x1:x){
			total+=x1;
		}
		System.out.println("the total is "+ total);
		System.out.println("hello");
	}
}




