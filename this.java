package oopsconcept;
class Apple{
    Apple(){
      System.out.println("default constructor");
    }
    Apple(int n){
      this();
    }
    public static void main(String[] args){
      Apple A = new Apple(1);
    }
};
