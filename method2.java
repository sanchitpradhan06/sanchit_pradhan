//gcd
public class method2{
 static int gcd(int m,int n){
while(m!=n){
if(m>n)
m=m-n;
else
n=n-m;
}
return m;
}
public static void main(String[]args)
{
System.out.println(gcd(39,12));
 }
}
 