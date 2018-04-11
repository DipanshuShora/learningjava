package polymorphism;
class TypesPromotion1{
  static void check(int a, int b){
    System.out.println("integer mothod is invoked");
  }
  static void check1(long a,long b){
    System.out.println("long mothod is invoked");
  }
  public static void main(String args[]){
    check(2,2);
  }
}
