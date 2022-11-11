class Bank {
 int getIntecrest() {
	return 0; }
	}
	
class Pravallika extends Bank {
int getInterest() {
return 10; }
}
	
class UBI extends Bank {
 int getInterest() {
	return 15; }
	}

class IDBI extends Bank {
 int getInterest() {
	return 20; }
	}
	
	class HDFC extends Bank {
		int getInterest() {
		return 9; }
	}


class AXIS extends Bank {
  int getInterest() {
     return 7; }
	 }	
	 
	  
 class Bank_Project {
	public static void main(String[] args) {
	
        Pravallika p=new Pravallika();
        System.out.println("Pravallika rate of Interest: "+p.getInterest());
		
		UBI u=new UBI();
		System.out.println("UBI rate of Interest: "+u.getInterest());
		
		IDBI i=new IDBI();
		System.out.println("IDBI rate of Interest: "+i.getInterest());
		
		AXIS a=new AXIS();
		System.out.println("Axis rate of Interest: "+a.getInterest());
	
	  
	}
 }
