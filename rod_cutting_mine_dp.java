package shuru;

import java.util.HashMap;
import java.util.Scanner;

public class rod_cutting_mine_dp {
	
	public static void maxvalue(int [] pricea,int [] lengtha,int length)
	{
		int a[][]=new int[lengtha.length+1][length+1];
		for(int j=0;j<length+1;j++)
			a[0][j]=0;
		for(int i=0;i<lengtha.length;i++)
			a[i][0]=0;
		for(int i=1;i<lengtha.length+1;i++)
		{
			for(int j=1;j<length+1;j++)
			{
				if(i>j)
					a[i][j]=a[i-1][j];
				else
					a[i][j]=Math.max(a[i-1][j],pricea[i-1]+a[i][j-i]);
			}
		}
		for(int i=1;i<lengtha.length+1;i++)
		{
			for(int j=1;j<length+1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("how many lengths that you will be able to cut");
	  int n=sc.nextInt();
	  int pricea[]=new int[n];
	  int lengtha[]=new int[n];
	  System.out.println("First put length and then price for each length");
	  for(int i=0;i<n;i++)
	  {
		  lengtha[i]=sc.nextInt();
		  pricea[i]=sc.nextInt();
	  }
	  System.out.println("Maximum length");
	  int length=sc.nextInt();
	  maxvalue(pricea, lengtha, length);
	  
		
		

	}

}
