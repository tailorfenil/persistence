import java.util.Arrays;
import java.util.HashMap;

public class anagramsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []arr={"art","tar","top","pot","neat","rat","tape","nate","peat","random"};
		String []sarr=sortarr(arr);
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
			System.out.println(arr[i]);
		}
		HashMap<String, String> m1=new HashMap<String, String>();
		for(int i=0;i<sarr.length;)
		{
			if(m1.containsKey(sarr[i]))
			{
				m1.put(sarr[i],m1.get(sarr[i])+","+arr[i++]);
			}
			else
			{
				m1.put(sarr[i],arr[i++]);
			}
			
		}
		for(String s:m1.keySet())
		{
			System.out.println("["+m1.get(s)+"]");
		}

	}
	
	public static String[] sortarr(String [] arr)
	{
		char[]a1;
		int i=0;
		String[] arr1=new String[arr.length];
		for(i=0;i<arr.length;i++)
		{
			a1=arr[i].toCharArray();
			Arrays.sort(a1);
			arr1[i]=String.valueOf(a1);
		}
		return arr1;
		
	}

}
