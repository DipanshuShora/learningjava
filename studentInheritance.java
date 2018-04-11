package inheritance;
class Student{
  int studentId;
  String studentName;
};
class Humanities extends Student{
  void selectStream(){
    studentId=001;
    studentName="Dipanshu";
    System.out.println(studentId+" & "+studentName);
  }
};
class Science extends Student{
  void selectStream(){
    studentId=002;
    studentName="Arun";
    System.out.println(studentId+" & "+studentName);
  }
};
class Commerce extends Student{
  void selectStream(){
    studentId=003;
    studentName="Arvind";
    System.out.println(studentId+" & "+studentName);
  }
};
public class studentInheritance{
  public static void main(String args[]){
    new Humanities().selectStream();
    new Science().selectStream();
    new Commerce().selectStream();
  }
};
