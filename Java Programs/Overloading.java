class Adder{
static int addition(int a, int b){
return a+b;
}  
static double add(double a, double b){
return a+b;
}  
}  
class Overloading{  
public static void main(String[] args){  
System.out.println(Adder.add(1,2));  
System.out.println(Adder.add(12.3,12.6));  
}}  