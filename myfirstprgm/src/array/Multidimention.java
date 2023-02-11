package array;

public class Multidimention {

	public static void main(String[] args) {
		String array[][]=new String[2][2];
		
		array[0][0]="pagadala";
		array[0][1]="maheswari";
		array[1][0]="ramana";
		array[1][1]="ramreddy";
		
		for(int i=0;i<=1;i++) {
			
	      for(int b=0;b<=1;b++)
	       {
		    System.out.println(array[i][b]);
	       }
	    }
	 
		
			
        
		
	}
}
