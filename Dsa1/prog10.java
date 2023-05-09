import java.util.Scanner;
public class prog10 {

	public static  double sumcolumn ( double[][]m,int columnIndex) {
		  double sumClm=0.0;
		  for(int i=0;i<m.length;i++) {
			  sumClm+=m[i][columnIndex];
		  }
		  return sumClm;
		  
	}
			  public static void main(String[] args) {
				  double a[][]=new double[3][4];
				  Scanner sc=new Scanner(System.in);
				  System.out.println("enter the elements : ");
				  for(int i=0;i<3;i++) {
					  for(int j=0;j<4;j++) {
						  a[i][j]=sc.nextDouble();
					  }
				
			}
			  for(int i=0;i<3;i++) {
				  for(int j=0;j<4;j++) {
					  System.out.print (a[i][j]+ "   ");
					  
				  }
				  System.out.println();
			  
		  }
			  for(int j=0;j<4;j++) {
				  System.out.println("Sum of the elements at column" +j+ "is" +sumcolumn(a,j));
			  }
		 

	}


}