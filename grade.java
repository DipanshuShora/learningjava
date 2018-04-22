package controlstatement;
import java.util.Scanner;
class grade{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    System.out.print("Enter Grade: ");
    char marks = S.next().charAt(0);
    switch(marks){
      case 'A':
      System.out.println("Excellent");
      break;
      case 'B':
      System.out.println("Good");
      break;
      case 'C':
      System.out.println("Keep it up");
      break;
      case 'D':
      System.out.println("Poor");
      default:
      System.out.println("Fail");
    }
  }
};
