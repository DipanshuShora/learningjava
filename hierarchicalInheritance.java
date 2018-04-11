package inheritance;
class Car extends AutoMobile{
  void show(){
    fourWheel = "Car is a four wheel drive vehicle";
    System.out.println(fourWheel);
  };
};
class Bike extends AutoMobile{
  void show(){
    twoWheel = "Bike is a two wheel drive vehicle";
    System.out.println(twoWheel);
  };
};
class AutoMobile{
  String twoWheel,fourWheel;
};
public class hierarchicalInheritance{
  public static void main(String[] args){
    new Car().show();
    new Bike().show();
  }
};
