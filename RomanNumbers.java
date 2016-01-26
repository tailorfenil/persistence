package shuru;

import java.util.HashMap;

public class RomanNumbers {
	
	public static int romanToInt(String a) {
		
		
		
		/* na if(a.length()%2==0)
		{
		for(int i=a.length()-1;i>=0;i-=2)
		{
			if(m1.get(a.charAt(i))>m1.get(a.charAt(i-1)))
			{
				sum+=m1.get(a.charAt(i))-m1.get(a.charAt(i-1));
			}
			else
			{
				sum+=m1.get(a.charAt(i))+m1.get(a.charAt(i-1));
			}
		}
		}
		else
		{
			for(int i=a.length()-1;i>0;i-=2)
			{
				if(m1.get(a.charAt(i))>m1.get(a.charAt(i-1)))
				{
					sum+=m1.get(a.charAt(i))-m1.get(a.charAt(i-1));
				}
				else
				{
					sum+=m1.get(a.charAt(i))+m1.get(a.charAt(i-1));
				}
				
			}
			sum+=m1.get(a.charAt(0));
		}na */
		
		
		/*int sum=0;
		HashMap<Character, Integer> m1=new HashMap<Character, Integer>();
		m1.put('I', 1);
		m1.put('V', 5);
		m1.put('X', 10);
		m1.put('L', 50);
		m1.put('C', 100);
		m1.put('D', 500);
		m1.put('M', 1000);
		
		for(int i=a.length()-1;i>0;i--)
		{
			if(m1.get(a.charAt(i))>m1.get(a.charAt(i-1)))
			{
				sum+=m1.get(a.charAt(i))-m1.get(a.charAt(i-1));
			}
			else
			{
				sum+=m1.get(a.charAt(i))+m1.get(a.charAt(i-1));
			}
		}
		
		for(int i=1;i<a.length()-1;i++)
		{
			sum-=m1.get(a.charAt(i));
		}
		return sum;
		*/
		
		   int i=0;
	        int ret=0;
	        String codes[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        while(a.length()>0)
	        {
	            while(a.startsWith(codes[i]))
	            {
	                ret+=val[i];
	                a=a.substring(codes[i].length());
	            }
	            i++;
	        }
	        return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(romanToInt("CMM"));

	}

}
