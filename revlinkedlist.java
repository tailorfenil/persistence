package shuru;

public class revlinkedlist {
	
	private  Node head;
	private static class Node
	{
		private int value;
		private Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public void addtothelast(Node node)
	{
		if(head==null)
			head=node;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			temp=temp.next;
			
			temp.next=node;
		}
	}
	
	public void print(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.format("%d", temp.value);
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	public Node reverselinkedlist(Node head)
	{
		Node prev=null;
		Node curr=head;
		Node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revlinkedlist linkedlist=new revlinkedlist();
		Node head=new Node(5);
		linkedlist.addtothelast(head);
		linkedlist.addtothelast(new Node(1));
		linkedlist.addtothelast(new Node(2));
		linkedlist.addtothelast(new Node(3));
		linkedlist.addtothelast(new Node(4));
		linkedlist.print(head);
		Node revlisthead=linkedlist.reverselinkedlist(head);
		linkedlist.print(revlisthead);
		
		

	}

}
