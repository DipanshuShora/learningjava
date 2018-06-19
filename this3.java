package oopsconcept;
class Argument{
  void args(Argument obj){
    System.out.println("Method is invoked");
  }
  Argument(){
    args(this);
  }
  public static void main(String[] args){
    new Argument();
  }
};
