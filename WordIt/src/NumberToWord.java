
import java.util.Scanner;
public class NumberToWord{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean Done = false;
		boolean hasProperty=false;
		System.out.println("Enter the number to be converted, type Done when want to quit");
		while(!Done)
		{
			String input = sc.next();
			int size=input.length();
			if(size==1)
			{
				String word= oneDigit(input);
				System.out.println(word);


				if(input.equalsIgnoreCase("Done"))
				{ 
					Done = true;
				}
			}
			else if(size==2)
			{   
				int toNumber= Integer.parseInt(input);
				if(toNumber>=10 && toNumber<=19)
				{
					String word= TwoDigit(input);
					System.out.println(word);
				}
				else if(toNumber >19) { 
					String st = input.substring(0,1);


					String st1 = input.substring(1,2);
					if(st1.equals("0"))
					{   
						String st2 = input.substring(0,1);

						System.out.println(TwoDigit1(st2));
					}
					else{
						String word2= TwoDigit1(st);
						String word = oneDigit(st1);

						System.out.println(word2+" "+word);
					}
				}
			}
			else if(size==3)
			{ 
				//int toNumber= Integer.parseInt(input);
				String ones = input.substring(0,1);
				String tenth = input.substring(1,2);
				String hundredth = input.substring(2,3);

				if(tenth.equals("0") && hundredth.equals("0"))
				{ 
					String ThirdDigit = ThreeDigit(ones);
					System.out.println(ThirdDigit);
				}
				else if(tenth.equals("0"))
				{ 
					String middleZero = ThreeDigit(ones);
					String lastDigit =oneDigit(hundredth);
					System.out.println(middleZero+" "+lastDigit);
				}
				else if(hundredth.equals("0"))
				{ 
					String middleZero = ThreeDigit(ones);
					String secondDigit =TwoDigit1(tenth);
					System.out.println(middleZero+" "+secondDigit);
				}
				else if(tenth.equals("1"))
				{ String tent = input.substring(1,3);
					String middleZero = ThreeDigit(ones);
					String secondDigit =TwoDigit(tent);
					//String lastDigit =oneDigit(hundredth);
					System.out.println(middleZero+" "+secondDigit);
				}
				
				else{

					String middleZero = ThreeDigit(ones);
					String secondDigit =TwoDigit1(tenth);
					String lastDigit =oneDigit(hundredth);
					System.out.println(middleZero+" "+secondDigit+""+lastDigit);
				}

			}
		}
	}


	static String z="";
	public static String oneDigit(String num)
	{ 
		String y=num;


		switch(y)
		{ 
		case "1":
		{ 
			z= "one";
			break;
		}
		case "2":
		{ 
			z="Two";
			break;
		}
		case "3":
		{ 
			z="Three";
			break;
		}
		case "4":
		{ 
			z="Four";
			break;
		}
		case "5":
		{ 
			z="Five";
			break;
		}
		case "6":
		{ 
			z="Six";
			break;
		}
		case "7":
		{ 
			z="Seven";
			break;
		}
		case "8":
		{ 
			z="Eight";
			break;
		}
		case "9":
		{ 
			z="Nine";
			break;
		}
		default:{ 
			return "wrong entry";

		}
		} 
		return z;
	}
	public static String TwoDigit(String num)
	{ 
		String y=num;


		switch(y)
		{ 
		
		case "11":
		{ 
			z= "Eleven";
			break;
		}
		case "12":
		{ 
			z="Twelve";
			break;
		}
		case "13":
		{ 
			z="Thrteen";
			break;
		}
		case "14":
		{ 
			z="Fourteen";
			break;
		}
		case "15":
		{ 
			z="Fifteen";
			break;
		}
		case "16":
		{ 
			z="Sixteen";
			break;
		}
		case "17":
		{ 
			z="Seventeen";
			break;
		}
		case "18":
		{ 
			z="Eighteen";
			break;
		}
		case "19":
		{ 
			z="Nineteen";
			break;
		}
		default:{ 
			return "wrong entry";

		}
		} 
		return z;
	}
	public static String TwoDigit1(String num)
	{ 
		String y=num;


		switch(y)
		{ 

		case "2":
		{ 
			z="Twenty";
			break;
		}
		case "3":
		{ 
			z="Thirty";
			break;
		}
		case "4":
		{ 
			z="Fourty";
			break;
		}
		case "5":
		{ 
			z="Fifty";
			break;
		}
		case "6":
		{ 
			z="Sixty";
			break;
		}
		case "7":
		{ 
			z="Seventy";
			break;
		}
		case "8":
		{ 
			z="Eighty";
			break;
		}
		case "9":
		{ 
			z="Ninety";
			break;
		}
		default:{ 
			return "wrong entry";

		}
		} 
		return z;
	}
	public static String ThreeDigit(String num)
	{ 
		String y=num;


		switch(y)
		{ 
		case "1":
		{ 
			z= "One Hundred";
			break;
		}
		case "2":
		{ 
			z="Two Hundred";
			break;
		}
		case "3":
		{ 
			z="Three Hundred";
			break;
		}
		case "4":
		{ 
			z="Four Hundred";
			break;
		}
		case "5":
		{ 
			z="Five Hundred";
			break;
		}
		case "6":
		{ 
			z="Six Hundred";
			break;
		}
		case "7":
		{ 
			z="Seven Hundred";
			break;
		}
		case "8":
		{ 
			z="Eight Hundred";
			break;
		}
		case "9":
		{ 
			z="Nine Hundred";
			break;
		}
		default:{ 
			return "wrong entry";

		}
		} 
		return z;
	}
}

