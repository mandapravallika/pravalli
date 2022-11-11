class Bank {
int getInterest() {
return 0; }
}

class PRAVALLIKA extends Bank {
int getInterset() {
return 10; }
}

class UBI extends Bank {
int getInterset() {
return 20; }
}

class IDBI extends Bank {
int getInterest() {
return 25; }
}

class Test_Bank {
public static void main(String args[]) {

PRAVALLIKA p=new PRAVALLIKA();
System.out.println("PRAVALLIKA rate of Interest: "+p.getInterest());


UBI u=new UBI();
System.out.println("UBI rate of Interest: "+u.getInterset());

IDBI i=new IDBI();
System.out.println("IDBI rate of Interest: "+i.getInterest());

}
}



