import java.util.Scanner;

public class processor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.print( "First Number? :" );
		String fname= keyboard.nextLine();
		System.out.print( "Last Number?  :" );
		String lname =keyboard.nextLine();*/
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "second Number? :" );
		num2 = keyboard.nextInt();
		int x=sum(num1,num2);
		int y=product(num1,num2);
		if(x>=200 && x<=1000)
		{ 
			System.out.println("the sum is :"+" "+x+"*"+"the product is:"+product(num1,num2)+"the average is:"+" "+average(x));
		}
		else if(x> 1000)
		{ 
			System.out.println("the sum is :"+" "+x+"~"+"the product is:"+product(num1,num2)+"the average is:"+" "+average(x));
			
		} else{ 
			System.out.println("the sum is :"+ " "+x+" "+"the product is:"+product(num1,num2)+"the average is:"+" "+average(x));
		}
		
	}
 public static int sum(int one ,int two)
 { 
	int add = one+two;
	return add;
 }
 public static int product(int one ,int two)
 { 
	int multiply = one*two;
	return multiply;
 }
 public static double average(int sum)
 { 
	 double ave = sum/2;
	 return ave;
 }
}
