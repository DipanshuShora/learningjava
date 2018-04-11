package polymorphism;
class Multiplication{
  static int multiply(int n){
    return (n);
  }
  static float multiply(int n, float n1){
    return (n*n1);
  }
  static double multiply(int n,float n1, double n2){
    return (n*n1*n2);
  }
  public static void main(String args[]){
    System.out.println(multiply(1));
    System.out.println(multiply(1,2f));
    System.out.println(multiply(1,2f,3));
  }
};
