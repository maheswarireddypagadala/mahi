package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            List<Object>mahi=new ArrayList<>();
            mahi.add(10);
            mahi.add("mahi");
            mahi.add(1.2344);
            
            
            System.out.println(mahi.get(0));
            System.out.println(mahi.get(1));
            
            
    for(int i=0;i<mahi.size();i++)
    {
    	System.out.println(mahi.get(i));
    }
 }

}
 