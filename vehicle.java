package polymorphism;
class Vehicle{
  void run(){
    System.out.println("Vehicle is running");
  }
};
class Bike{
  void run(){
      System.out.println("Bike is running");
  }
  public static void main(String args[]){
    Bike B1 = new Bike();
    B1.run();
  }
};
