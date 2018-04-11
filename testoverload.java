package polymorphism;
class TestOverload{
  public static void main(String[] args){
    System.out.println("Main with array of string");
  }
  public static void main(String args){
    System.out.println("Main without array of string");
  }
  public static void main(){
    System.out.println("Main without string");
  }
};
