package polymorphism;
class TypesPromotion2{
  void check(int n1,long n2){
    System.out.print("Integer And Long");
  }
  void check(long n1,int n2){
    System.out.println("Long And Integer");
  }
  public static void main(String[] args){
    TypesPromotion2 TP1 = new TypesPromotion2();
    TP1.check(2,3);
  }
};
