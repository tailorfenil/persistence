package shuru;

import java.util.Stack;

public class Sort_Stack_Using_Recursion {
	
	public static void sort(Stack<Integer> s)
	{
		if(!s.isEmpty())
		{
			int temp=s.pop();
			sort(s);
			sortedinsert(s,temp);
		}
		
	}
	
	public static void sortedinsert(Stack<Integer> s,int temp)
	{
		if(!s.isEmpty() || temp>s.peek())
		{
			s.push(temp);
		}
		else
		{
			int temp1=s.pop();
			sortedinsert(s, temp);
			s.push(temp1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Stack<Integer> s1=new Stack<Integer>();
		
		s1.push(30);
		s1.push(-5);
		s1.push(18);
		s1.push(14);
		s1.push(-3);
		
		sort(s1);
		
		while(!s1.isEmpty())
		{
			System.out.println(s1.pop());
		}
		
		
		
		
	}

}
