import java.util.*;
public class  rectangle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of the rectangle: ");
double L=sc.nextDouble();
System.out.print("Enter the breadth of the rectangle: ");
double B=sc.nextDouble();
double A=L*B;
double P=2*(L+B);
System.out.println(" The area of the rectangle is: "  +A);
System.out.println(" The  perimeter of the rectangle is:  "  +P);
     }
}
 