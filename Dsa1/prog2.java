 import java.util.Scanner;
public class  prog2 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the weight in kg : ");	
		double weight=sc.nextDouble();
		System.out.println("Enter the height in meters : ");
		double height=sc.nextDouble();
		double BMI=weight/(height*height);
		if(BMI<18.5)
		System.out.println("under weight");
		
		else if(  BMI>18.5 && BMI<24.9 )
	      System.out.println("Normal weight");
		
		else if(BMI>25.0&&BMI<29.9) 
			  System.out.println("Overweight");
		
		else
			System.out.println("obese");
		sc.close();

	}

}