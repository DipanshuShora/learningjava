package polymorphism;
class Addition{
  int add(int n){
    return (n+n);
  }
  double add(int n,int n1){
    return (n+n1);
  }
  float add(int n,int n1,int n2){
    return (n+n1+n2);
  }
  public static void main(String args[]){
    int num1,num2,num3;
    Addition A1 = new Addition();
    num1 = A1.add(1);
    num2 = (int) A1.add(1,2);
    num3 = (int) A1.add(1,2,3);
    System.out.println(num1+" & "+num2+" & "+num3);
  }
};
