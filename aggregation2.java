package aggregation;
class Address{
  String city,state,country;
  public Address(String city,String state,String country){
    this.city=city;
    this.state=state;
    this.country=country;
  }
};
class Employee{
  int id;
  String name;
  Address address;
  public Employee(int id,String name,Address address){
    this.id = id;
    this.name = name;
    this.address = address;
  }
  void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
  }
  public static void main(String args[]){
    Address A1 = new Address("B1","Delhi","India");
    Address A2 = new Address("B2","Delhi","India");
    Employee E1 = new Employee(01,"Arun",A1);
    Employee E2 = new Employee(02,"Dipanshu",A2);
    E1.display();
    E2.display();
  }
};
