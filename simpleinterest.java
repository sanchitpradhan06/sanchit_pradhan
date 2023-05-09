import java.util.*;
public class simpleinterest{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the principle  amount: ");
Double p=sc.nextDouble();
System.out.print("Enter the time in years : ");
double n=sc.nextDouble();
System.out.print("Enter the Annual rate of interest : ");
double r=sc.nextDouble();
double SI=(p*n*r)/100.0;
System.out.println("the simple interest is : " +SI);
   }
 }

