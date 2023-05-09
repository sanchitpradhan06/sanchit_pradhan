 import java.util.Scanner;

public class prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int sum=0,product=1,t=n;
		
		while(n!=0)
		{
			int r=n%10;
			sum+=r;
			product*=r;
			n/=10;
		}
		if (sum==product) {
			System.out.println(t+"is a spy number ");
		}
		else {
			System.out.println(t+ "is not a spy number");
			sc.close();
		}
			
		}  
	 
}