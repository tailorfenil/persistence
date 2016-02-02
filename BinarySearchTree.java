import java.awt.DisplayMode;
import java.util.Queue;
import java.util.*;

public class BinarySearchTree {
	
	public static Node root;
	
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	public void ins(int id)
	{
		Node newnode=new Node(id);
		if(root==null)
		{
			root=newnode;
			return;
		}
		Node curr=root;
		Node par=null;
		
		while(true)
		{
			par=curr;
			if(id<curr.val)
			{
			  curr=curr.left;
			  if(curr==null)
			  {
				  par.left=newnode;
				  return;
			  }
			}
			  else
			 {
				  curr=curr.right;
			  if(curr==null)
			  {
				par.right=newnode;
				return;
			  }
			 }
		}
	}
	
	public void dis(Node root)
	{
		if(root!=null)
		{
		dis(root.left);
		System.out.println(root.val+" ");
		dis(root.right);
		}
		
	}
	
	public boolean find(int id)
	{
		Node curr=root;
		while(curr!=null)
		{
		if(id==curr.val)
			return true;
		else if(id<curr.val)
		{
			curr=curr.left;
		}
		else
		{
			curr=curr.right;
		}		
		}
		return false;
		
	}
	
	public boolean delete(int id)
	{
		Node parent=null;
		Node current=root;
		boolean isleft=false;
		while(current.val!=id)
		{
			parent=current;
			if(id<current.val)
			{
				current=current.left;
				isleft=true;
			}
			else
			{
				current=current.right;
				isleft=false;
			}
			if(current==null)
				return false;
		}
		
		if(current.left==null && current.right==null)
		{
			if(current==root)
				root=null;
			if(isleft==true)
				parent.left=null;
			else
				parent.right=null;
		}
		
		else if(current.right==null)
		{
		  if(current==root)
			  root=current.left;	
		  else if(isleft)
			  parent.left=current.left;
		  else
			  parent.right=current.left;
		
		}
		else if(current.left==null)
		{
			if(current==root)
				root=current.right;
			else if(isleft)
				parent.left=current.right;
			else
				parent.right=current.right;
		}
		
		else if(current.right!=null && current.left!=null)
		{
			
			Node successor=getsucc(current);
			if(current==root)
				root=successor;
			else if(isleft)
				parent.left=successor;
			else
				parent.right=successor;
				
		successor.left=current.left;		
        			
		}
		return true;
		
		
	}
	
	public Node getsucc(Node delnode)
	{
		Node succ=null;
		Node succp=null;
		Node curr=delnode.right;
		
		while(curr!=null)
		{
			succp=succ;
			succ=curr;
			curr=curr.left;
		}
		if(succ!=delnode.right)
		{
			succp.left=succ.right;
			succ.right=delnode.right;
		}
		return succ;
		}
	
	public void dislevel(Node root)
	{
		/*if(root!=null)
		{
	    System.out.println(root.val+" ");
		dis(root.left);
		dis(root.right);
		}*/
		
		Queue<Node>level=new java.util.LinkedList<Node>();
		level.add(root);
		Node n1;
		while(!level.isEmpty())
		{
			n1=level.poll();
			System.out.println("Hu"+n1.val+" ");
			if(n1.left!=null)
				level.add(n1.left);
			if(n1.right!=null)
				level.add(n1.right);
		}
		
	}
		
	
	public void min(Node root)
	{
		if(root!=null)
		{	
			min(root.left);
			System.out.println(root.val+"=min");
			return;
		}
		
	}
	public void max(Node root)
	{
		if(root!=null)
		{
			max(root.right);
			System.out.println(root.val+ "=max");
			return;
		}
	
	}
			  
			
	
	
	
	class Node
	{
		int val;
		Node left;
		Node right;
		
	public Node(int value)
	{
		this.val=value;
		left=null;
		right=null;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree b1=new BinarySearchTree();
		b1.ins(4);
		b1.ins(5);
		b1.ins(1);
		b1.ins(2);
		b1.dis(b1.root);
		System.out.println(b1.find(6));
        //b1.delete(1);
        b1.dislevel(b1.root);

	}

}
