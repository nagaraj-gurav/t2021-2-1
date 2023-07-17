import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("HI! Welcome to the Calculator,\nPlease enter first number");
		double a=sc.nextDouble();
		System.out.println("Please enter second number");
		double b=sc.nextDouble();
		sc.nextLine();
		System.out.println("type of operation");
		String n=sc.nextLine();
		double ans=0;
		switch (n)
		{
			case "+":
				ans=add(a, b);break;
			case "-":
				ans=sub(a,b);break;
			case "*":
				ans=mul(a,b);break;
			case "/":
				ans=div(a,b);break;
		}
		System.out.println("ans="+ans);			
	}

	public static double add(double a,double b)
	{
		return a+b;
		
	}
	public static double sub(double a,double b)
	{
		return a-b;
	}
	public static double mul(double a,double b)
	{
		return a*b;
	}
	public static double div(double a,double b)
	{
		return a/b;
	}
	
}
