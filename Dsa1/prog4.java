import java.util.*;
public class prog4 {

	public static void main(String[] args) {
		 
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a number: ");
				char c[]= {'C','A','R'};
				for(int i=0;i<c.length;i++)
				for(int j=0;j<c.length;j++)
				for(int k=0;k<c.length;k++)
				if(i!=j&&i!=k&&j!=k)
				System.out.println(""+c[i]+c[j]+c[k]);
				sc.close();
				
				
			


	}

}
