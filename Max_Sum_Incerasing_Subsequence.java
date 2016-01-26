package shuru;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Max_Sum_Incerasing_Subsequence {

	public static ArrayList<Integer> Max_Sum_Inc_Subseq(ArrayList<Integer> a1)
	{
		ArrayList<Integer> T=new ArrayList<Integer>(a1);
		ArrayList<Integer> P=new ArrayList<Integer>();
		ArrayList<Integer> ANS=new ArrayList<Integer>();
		for(int i=0;i<a1.size();i++)
		{
			P.add(i);
		}
		int flag=0,value=0;
		for(int i=1;i<a1.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				flag=0;
				if(a1.get(j)<a1.get(i))
				{
					value=T.get(i);
					T.set(i, Math.max(T.get(i), a1.get(i)+T.get(j)));
					if(T.get(i)!=value)
						flag=1;
				}
				if(flag==1)
				{
					P.set(i,j);
				}
				
			}
		}
		System.out.println(T);
		System.out.println(P);
		
		int index_max_sum=T.indexOf(Collections.max(T));
		int sum=0;
		sum=a1.get(index_max_sum);
		
		ANS.add(sum);
		while(sum!=Collections.max(T))
		{
		  //System.out.println(P.get(index_max_sum));
		  index_max_sum=P.get(index_max_sum);
         ANS.add(a1.get(index_max_sum));
         sum+=a1.get(index_max_sum);
 		  
		  
		}
		return ANS;
		
		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(4,6,1,3,8,4,6));
		System.out.println(Max_Sum_Inc_Subseq(a1));
		

	}

}
