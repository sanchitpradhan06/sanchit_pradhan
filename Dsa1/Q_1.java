package assignment_1;

import java.util.*;

public class Q_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		int c =0;
		if(n>2)
		{
		while(n>=2)
		{
			n=n/2;
			c++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+ c++);
		}
		
		else {
			System.out.println("Invalid number");
		}
		
	}

}
