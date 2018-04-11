package polymorphism;
class TypesPromotion{
  static void sum(int n1, long n2){
    System.out.println((n1+n2));
  }
  static void sum(int n1,long n2,long n3){
    System.out.println((n1+n2+n3));
  }
  public static void main(String[] args){
    sum(36542,68544334);
    sum(36542,68544334,65428422);
  }
};
