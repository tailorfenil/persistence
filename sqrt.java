package shuru;

public class sqrt {
	public static int sqrt(int a) {
	    int i;
	    if(a==1 || a==0)
	    return a;
	    
	    else
	    {
	    int low=0,high=a+1,mid;
	     while(1<high-low)  
	     {
	         mid=(low+high)/2;
	         if(mid*mid==a)
	         return mid;
	         
	         else if(mid*mid>a)
	         high=mid;
	         else if(mid*mid<a)
	         low=mid;
	             
	     }
	     return low;
	     }
	   
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(930675566));

	}
}

