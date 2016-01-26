package shuru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Max_Inc_Subseq_Length {
	
	public static int max_inc_subseq_len(ArrayList<Integer> a)
	{
		ArrayList<Integer> a2=new ArrayList<Integer>(Collections.nCopies(a.size(),1));
		for(int j=1;j<a.size();j++)
		{
			for(int i=0;i<j;i++)
			{
				if(a.get(j)>a.get(i))
					a2.set(j,Math.max((a2.get(i)+1),a2.get(j)));
			}
		}
		
		return Collections.max(a2);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.addAll(Arrays.asList(3,4,0,1,2,5,6,7));
        System.out.println(max_inc_subseq_len(a1));
		
		
		
		
		
	}

}
