 abstract class Bike{
   abstract void run();
 }

 class bike1 extends Bike{
 void run(){System.out.println("running safely..");
}

 public static void main(String args[]){
  Bike obj = new bike1();
  obj.run();
 }
 }
