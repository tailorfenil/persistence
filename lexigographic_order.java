package shuru;

public class lexigographic_order {

	
	 
	// A utility function to find factorial of n
	public static int fact(int n)
	{
	    return (n <= 1)? 1 :n * fact(n-1);
	}
	 
	// A utility function to count smaller characters on right
	// of arr[low]
	
	/*public static int findSmallerInRight(char[] str, int low, int high)
	{
	    int countRight = 0, i;
	 
	    for (i = low+1; i <= high; ++i)
	        if (str[i] < str[low])
	            ++countRight;
	 
	    return countRight;
	}
	 
	// A function to find rank of a string in all permutations
	// of characters
	static int findRank (char[] str)
	{
	    int len = str.length;
	    int mul = fact(len);
	    int rank = 1;
	    int countRight;
	 
	    int i;
	    for (i = 0; i < len; ++i)
	    {
	        mul /= len - i;
	 
	        // count number of chars smaller than str[i]
	        // fron str[i+1] to str[len-1]
	        countRight = findSmallerInRight(str, i, len-1);
	 
	        rank += countRight * mul ;
	    }
	 
	    return rank;
	}*/
	
	
	    

		   public static int smallerthanthis(char[] b,int low,int high)
		   {
		       int cnt=0;
		       for(int i=low+1;i<high;i++)
		       {
		           if(b[i]<b[low])
		           {
		               cnt++;
		           }
		       }
		       return cnt;
		       
		   }
		public static int findRank(String a) 
		    {
		        char[] b=a.toCharArray();
		        int mul=fact(b.length);
		        //int mul=1;
		        int rank=1;
		        for(int i=0;i<b.length;i++)
		        {
		            mul=mul/(b.length-i);
		            rank+=(smallerthanthis(b,i,b.length)*mul);
		        }
		        return rank;
		        
		    }
		    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String str1="fenil";
			char[] b=str1.toCharArray();
			System.out.println(findRank(str1));

		    System.out.println(104977600%1000003);
		    
		}
	}

	
	


