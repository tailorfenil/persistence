package shuru;

public class strstr {
	
	
	public static  int strStr(final String haystack, final String needle) {
		
		int k=-1,cnt,flag=0;
		
		if(needle==null || (needle==null && haystack==null)|| (haystack.length()< needle.length()))
			return -1;
		
		for(int i=0;i<haystack.length();i++)
		{
			cnt=0;
			for(int j=0;j<needle.length();j++)
			{
				if(needle.charAt(j)==haystack.charAt(i))
				{
				 k=i;
				 while(needle.charAt(j)==haystack.charAt(i))
				 {
					 j++;
					 i++;
					 cnt++;
					 if(cnt==needle.length())
					 {
						 flag=1;
						 return k;
					 }
					 else if(i>=haystack.length())
					 {
						 return -1;
					 }
				 }
				
				 i=k; 
				 break;
				}
				else
				{
				break;	
				}
				
					
			}
			
		}
		return -1;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(strStr("bbaba", "babbb"));
	}

}
