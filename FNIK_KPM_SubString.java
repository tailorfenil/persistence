package shuru;

public class FNIK_KPM_SubString {
	
	
	private int[] priorarray(char []pattern)
	{
		int []arr=new int[pattern.length];
		int index=0;
		
		for(int i=1;i<pattern.length;)
		{
			if(pattern[i]==pattern[index])
			{
				arr[i]=index+1;
				index++;
				i++;
			}
			else
			{
				if(index!=0)
				{
					index=arr[index-1];
				}
				else
				{
					arr[i]=0;
					i++;
				}
			}
		}
		return arr;
		
	}
	
	
	public boolean KMP_SUBSTR(char []string,char[] pattern)
	{
	
		int []arr=priorarray(pattern);
		int i=0,j=0;
		while(i<string.length && j<pattern.length)
		{
			if(string[i]==pattern[j])
			{
				i++;
				j++;
			}
			else
			{
				if(j!=0)
				{
					j=arr[j-1];
				}
				else
				{
					i++;
				}
			}
			
		}
		if(j==pattern.length)
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	FNIK_KPM_SubString fnik=new FNIK_KPM_SubString();
	  	boolean res=fnik.KMP_SUBSTR(String.valueOf("abbbbbbbbbddddddddxaacndabcdabxcdffdfdfvflfoabxc").toCharArray(), String.valueOf("abcdabxc").toCharArray());
	  	System.out.println(res);

	}

}
