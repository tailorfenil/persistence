package shuru;

import java.util.ArrayList;

public class sarchMatrix {
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		
		int asize=a.size(),low1,high1,mid1;
		
		 int low=0,high=a.size()-1,mid;
		
	    while(low<=high)
	    {
	    	mid=(low+high)/2;
	    	if(b>=a.get(mid).get(0) && b<=a.get(mid).get(a.get(mid).size()-1))
	    	{
	    		low1=0;
	    		high1=a.get(mid).size()-1;
	    		
	    		while(low1<=high1)
	    		{
	    			mid1=(low1+high1)/2;
	    			if(b==a.get(mid).get(mid1))
	    				return 1;
	    			else if(b<a.get(mid).get(mid1))
	    				high1=mid1-1;
	    			else if(b>a.get(mid).get(mid1))
	    				low1=mid1+1;
	    		}
	    		return 0;
	    	}
	    	
	    	else if(b<a.get(mid).get(0))
	    		high=mid-1;
	    	else if(b>a.get(mid).get(a.get(mid).size()-1))
	    		low=mid+1;
	    	
	    }
	    
	    return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<ArrayList<Integer>> a1=new ArrayList<ArrayList<Integer>>();
        
        ArrayList<Integer> a2=new ArrayList<Integer>();
        ArrayList<Integer> a3=new ArrayList<Integer>();
        ArrayList<Integer> a4=new ArrayList<Integer>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        
        a3.add(6);
        a3.add(7);
        a3.add(8);
        a3.add(10);
        
        a4.add(11);
        a4.add(13);
        a4.add(15);
        a4.add(17);
        a1.add(a2);
        a1.add(a3);
        a1.add(a4);
		System.out.println(searchMatrix(a1,9));
	}

}
