 import java .util.Scanner;
public class  prog9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		double[][] arr=new double[n][n];
		System.out.println("Enter n by n matrix by row by row:");
		for (int i=0; i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextDouble();
			}
		}
        double sum=sumMajorDiagonal(arr);
        System.out.println("sum of the element in the major diagonal is"+ sum);
	}
	public static double sumMajorDiagonal(double[][] array)
	{
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			for (int j=0;j<array.length;j++)
			{
				if (i==j)
				{
					sum=sum+array[i][j];
				}
			}
		}
		return sum;
	}

}	