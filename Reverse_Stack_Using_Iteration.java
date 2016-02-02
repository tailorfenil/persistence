package shuru;

import java.util.Stack;

public class Reverse_Stack_Using_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		
		s1.push(12);
		s1.push(34);
		s1.push(1);
		int temp;
		while(!s1.isEmpty())
		{
			temp=s1.pop();
			while(!s2.isEmpty() && temp<s2.peek())
			{
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		
		while(!s2.isEmpty())
		{
			System.out.println(s2.pop());
		}
		

	}

}
