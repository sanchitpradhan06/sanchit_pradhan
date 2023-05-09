import java.util.*;
public class conversion{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the degree in celsius: ");
double c=sc.nextDouble();  
double f=(9.0/5.0*c)+32;
System.out.print("The temperature in celsius to fahrenheit is :" +f);
  }
}
