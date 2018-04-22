package controlstatement;
import java.util.Scanner;
class Student{
  float marks;
  float input(){
    Scanner S = new Scanner(System.in);
    System.out.print("Enter Student Aggregate Marks: ");
    return marks = S.nextInt() / 5;
  }
  void grade(){
    float grade = input();
    if(grade >= 90){
      System.out.println("Excellent");
    }
    else if(grade >= 75 && grade < 90){
      System.out.println("Distinction");
    }
    else if(grade >= 60 && grade < 75){
      System.out.println("First Division");
    }
    else if(grade >=40 && grade < 60){
      System.out.println("Pass");
    }
    else{
      System.out.println("Fail");
    }
  }
  public static void main(String args[]){
    new Student().grade();
  }
};
