import java.util.*;
class Arith
{
public static void main(String[] arg)
{
int a,b,c;
System.out.println("Enter two values:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("Addition :"+c);
c=a-b;
System.out.println("Subtraction:"+c);
c=a*b;
System.out.println("Multiplication :"+c);
c=a/b;
System.out.println("Division :"+c);
c=a%b;
System.out.println("Modulo :"+c);
}}