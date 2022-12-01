import java.io.*;
import java.util.*;
abstract class Shape
{
 int a,b;
 abstract public void printarea();
}
class Rectangle extends Shape
{

public void printarea()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the length and breadth of rectangle");
 a=s.nextInt();
 b=s.nextInt();
 
 System.out.println("The area of rectangle is:"+a*b);
 }
 }
class Triangle extends Shape
{
public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base and height of triangle:");
a=s.nextInt();
b=s.nextInt();
System.out.println("The area of triangle is:"+0.5*a*b);
}
} 

class Circle extends Shape
{
public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of circle:");
a=s.nextInt();
System.out.println("The area of circle is:"+3.14*a*a);
 }
}
public class Client
{
 public static void main(String[] args)
{
Rectangle r=new Rectangle();
r.printarea();
Triangle t=new Triangle();
t.printarea();
Circle r1=new Circle();
r1.printarea();
}
}
