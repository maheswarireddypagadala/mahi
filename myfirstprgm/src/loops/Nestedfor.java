package loops;

public class Nestedfor {

   public static void main(String[] args) {
		
    for(int a=1;a<6;a++)
    {
      for(int b=0;b<a;b++) {
       System.out.print( b );
        }
      System.out.println();
    }
   
   System.out.println("@@@@@@@@@@@@@");
   for(int a=10;a>=5;a--)
   {
     for(int b=12;b>=a;b--) 
     {
       System.out.print(b);
     }
   
    System.out.println();
   }
   for(int a=5;a>=0;a--) 
   {
	 for(int b=5;b>=a;b--) 
     {
       System.out.print(b);
     }
     System.out.println();   
  
   }
  }
 
}
  
