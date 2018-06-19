package oopsconcept;
class School{
  int rollno;
  String name,course;
  float fee;
  School(int rollno,String name,String course,float fee){
    this(rollno,name,course);
    this.fee = fee;
  }
  School(int rollno, String name,String course){
    this.rollno = rollno;
    this.name = name;
    this.course = course;
  }
  public static void main(String[] args){
    School S1 = new School(24,"Dipanshu","BCA");
    School S2 = new School(8161629,"Deepanshu","BCA",78f);
    System.out.println(S1.rollno+" "+S1.name+" "+S1.course);
    System.out.println(S2.rollno+" "+S2.name+" "+S2.course+" "+S2.fee);
  }
};
