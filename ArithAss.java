import java.util.*;
class ArithAss
{
public static void main(String[] arg)
{
int a,b;
System.out.println("Enter two values:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a+=b;//a=a+b
System.out.println("Addition :"+a);
a-=b;//a=a-b
System.out.println("Subtraction:"+a);
a*=b;//a=a*b
System.out.println("Multiplication :"+a);
a/=b;//a=a/b
System.out.println("Division :"+a);
a%=b;//a=a%b
System.out.println("Modulo :"+a);
}}