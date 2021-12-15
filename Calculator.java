import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		double ans , add , add2, mult, mult2, sub, sub2, div, div2, perc, perc2;
		String yn;
		try (Scanner s1 = new Scanner(System.in)) {
			do {
				System.out.println("Do you want to multiply, divide, subtract or add?");
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Divide");
				System.out.println("5. Percentage");
				int ch=s1.nextInt();
				
				double sm;
				switch(ch) {
				case 1:
						System.out.println("Enter first number: ");
						add=s1.nextDouble();
						
						System.out.println("Enter second number: ");
						add2=s1.nextDouble();
						
						ans= add+add2;
						
						System.out.println("Your answer is: " + ans);
						
					break;
				
				case 2:
						System.out.println("Enter first number: ");
						mult=s1.nextDouble();
							
						System.out.println("Enter second number: ");
						mult2=s1.nextDouble();
						
						ans=mult*mult2;
						
						System.out.println("Your answer is: " + ans);
						
					break;
					
				case 3:
						System.out.println("Enter first number: ");
						sub=s1.nextDouble();
						
						System.out.println("Enter second number: ");
						sub2=s1.nextDouble();
						
						ans=sub-sub2;
						
						System.out.println("Your answer is: " + ans);
					
					break;
				
				case 4: 
						System.out.println("Enter first number: ");
						div=s1.nextDouble();
						
						System.out.println("Enter second number: ");
						div2=s1.nextDouble();
						
						ans=div/div2;
						
						System.out.println("Your answer is: " + ans);
						
					break;
					
				case 5:
						System.out.println("Enter first number: ");
						perc=s1.nextDouble();
						
						System.out.println("Enter second number: ");
						perc2=s1.nextDouble();
						
						sm=perc/perc2;
						ans=sm*100;
						
						System.out.println("Your answer is: " + ans + "%");
						
					break;
						
				default:
						System.out.println("Option not available");
				} System.out.println("Do you want to do more maths? (y/n): ");
				yn =s1.next();
			} while(yn.equalsIgnoreCase("y"));
		}
			

	}}
