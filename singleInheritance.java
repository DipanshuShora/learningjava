package inheritance;
class Earth extends Universe{
  void world(){
    life="Life is on Earth";
    System.out.println(life);
  }
  public static void main(String args[]){
    Earth E = new Earth();
    E.world();
  }
};
class Universe{
  String life;
};
