

import java.util.Scanner; 

class NaturalNumbers 
{


    public static void main(String args[]) 
    {         
		Scanner s = new Scanner(System.in); 
        System.out.println("Enter the limit: "); 
        int n=s.nextInt(); 
        System.out.println("Numbers are: "); 
        for(int i=1; i<=n; i++)  
            System.out.print(i+" "); 
    } 
} 