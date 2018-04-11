package polymorphism;
class RBI{
  double rateOfInterest(){
    return 6.1;
  };
};
class SBI extends RBI{
  double rateOfInterest(){
    return 6.5;
  };
};
class PNB extends RBI{
  double rateOfInterest(){
      return super.rateOfInterest();
  }
};
class BOI extends RBI{
  double rateOfInterest(){
    return 7.1;
  };
};
class Bank{
  public static void main(String args[]){
    SBI S = new SBI();
    PNB P = new PNB();
    BOI B = new BOI();
    System.out.println("SBI rate of interest : "+S.rateOfInterest());
    System.out.println("PNB rate of interest : "+P.rateOfInterest());
    System.out.println("BOI rate of interest : "+B.rateOfInterest());
  }
};
