package inheritance;
class Capital extends State{
  String capitalName="New Delhi";
  void myCapitalName(){
    System.out.println(capitalName+" is capital of "+stateName+" and country in "+countryName);
  }
  public static void main(String[] args){
    new Capital().myCapitalName();
  }
};
class State extends Country{
  String stateName="Delhi";
};
class Country{
  String countryName="India";
};
