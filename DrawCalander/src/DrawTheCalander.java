import java.util.*;
public class DrawTheCalander {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};

		System.out.println("enter the month here");
		int month =sc.nextInt();
		System.out.println("enter the date here");
		int day =sc.nextInt();
		System.out.println("enter the year here");
		int year =sc.nextInt();

		GregorianCalendar gc = new GregorianCalendar(year,month,day);

		int monthInfo=gc.get(Calendar.MONTH);

		//System.out.println("Month:" + months[gc.get(Calendar.MONTH)]);

		int dayInfo=gc.get(Calendar.DATE);
		//
		int yearInfo=gc.get(Calendar.YEAR);
		int DayOfTheWeek =gc.get(Calendar.DAY_OF_WEEK)-1;
		/**
		 * It is now time to start to draw the calander
		 */
		System.out.println(DayOfTheWeek);
		//System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		String[]arr = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
		int z;
		int w=0;
		int count=0;
		int counter=0;
		switch(DayOfTheWeek)
		{ 
		case 4:
		{  
//			for(z=1;z<=7;z++)
//		     { 
//			  System.out.print(z);
//		      }
		for(int k=0;k<arr.length;k++)
		{ 
			System.out.print(arr[k]+"\t");
		}
		System.out.println();
		
		for(int j=0;j<5;j++)
		{
			System.out.print("\t");
			w++;
		}
		// int counter=1;
		for(int i=1;i<=31;i++)
		{  
			if(w+i==7)
			{ 
				System.out.println(i);
				i+=1;
				
			}
			
			else if(i==7)
			{ 
				System.out.print(i+"\t");
				count++;
				if(i==w+counter)
				{ 
					System.out.println();
				}
				
			}
			
			else if(i%7!=0)
			{   
			   
				System.out.print(i+"\t");

			}
			
		
		else{	    
				System.out.print(i+"\t\n");
				//System.out.println();
		}	

			

		}
		break;
		}




		}//System.out.println("this is w:"+w);
	}
	public static void Display()
	{ 
		System.out.println("\t");
	}
}