package oopsconcept;
class Banana{
  Banana(){
    this(2);
  }
  Banana(int n){
    System.out.println("Parameterised Constructor");
  }
  public static void main(String[] args){
    new Banana();
  }
};
