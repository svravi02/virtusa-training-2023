class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){
    super.eat(); 
    System.out.println("barking...");}  
}  
class Main{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
  
}}  

/*
Output:
eating...
barking...
*/
