 import java.util.*;
public class prog8 {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no. of rows and coloumns : ");
	int r= sc.nextInt();
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	int sum=0;
	System.out.println("enter the number of elements : ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=sc.nextInt();
			sum+=a[i][j];
		}
	}
			System.out.println("enter the elements of matrix: ");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println(a[i][j]+"\t");
				}
				System.out.println();
			}
		System.out.println("sum of the elements: " +sum);
	}
}


	
