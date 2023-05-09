import java.util.*;
public class circle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");
Double r=sc.nextDouble();
Double area=Math.PI*r*r;
Double perimeter=2*Math.PI*r;
System.out.println("The area of the circle is " +area);
System.out.println("The  perimeter of the circle is " +perimeter);
}
}
