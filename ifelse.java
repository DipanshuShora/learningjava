package controlstatement;
import java.util.Scanner;
class ifelse{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    System.out.print("Enter any two number: ");
    int n1 = S.nextInt(),n2 = S.nextInt();
    if(n1 > n2){
      System.out.println("N1 is greater than n2");
    }
    else{
      System.out.println("N2 is greater than n1");
    }
  }
};
