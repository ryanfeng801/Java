package Ren060;

public class ShapeLinkedList 

{

    public Node head; // Head is first node in linked list

    public ShapeLinkedList() 
	{
    }

    public ShapeLinkedList(Node head) 
	{
        this.head = head;
    }

    public boolean isEmpty() 
	{
        return length() == 0;
    }
	
    public void insertAtEnd(Shape data) 
	{
        if(head == null) { head = new Node(data, null);}
		else {
			Node currentNode = head;
			while(currentNode.getNext() != null) { currentNode = currentNode.getNext();}
			currentNode.next = new Node(data, null);
			}
    }
	
    public void insertAtBeginning(Shape data) 
	{
        Node currentNode = head;
		
		head = new Node(data, currentNode);
    }
     
	public Node tail() 
	{
       Node currentNode = head;
		
		while(currentNode.getNext() != null)
			currentNode = currentNode.getNext();
		
		return currentNode;
    }
	
    public int length() 
	{
        Node currentNode = head;
		
		int leng=0;
		
		while(currentNode != null)
		{
			currentNode = currentNode.getNext();
			leng++;
		}
		
		return leng;
    }
    
	void insertAtIndex(int idx, Shape data) 
	{
        Node currentNode = head;
		for (int i=1; i<idx-1; i++)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.next = new Node(data, currentNode.getNext());
    }
	
    Node findAtIndex(int idx) 
	{
        Node currentNode = head;
		for (int i=1; i<idx; i++)
		{
			currentNode = currentNode.getNext();
		}
		return currentNode;
    }
	
    void deleteAtIndex(int idx) 
	{
        Node currentNode = head;
		for (int i=1; i<idx-1; i++)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.next = currentNode.getNext().getNext();
    }
	
@Override
    public String toString()
	{
		Node currentNode = head;
			while (currentNode != null)
			{
				System.out.println(currentNode.data);
				currentNode = currentNode.getNext();
			}
			return "Done";
    }
	
    void deleteData(Shape s) 
	{
       Node currentNode = head;
		while (currentNode != null){
			if (currentNode.data != s) {
				currentNode = currentNode.getNext();
			}
			else {
				currentNode.data = currentNode.getNext().data;
				currentNode.next = currentNode.getNext().getNext();
			}
		}
    }
	
@Override
    public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		return result;
    }
	
@Override
    public boolean equals(Object obj) 
    {
    if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShapeLinkedList other = (ShapeLinkedList) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		return true;
    }
// Node is nested class because it only exists along with linked list
    public static class Node 
	{
       
	    private Shape data;
        private Node next;
		
		public Node(Shape d,Node n)
		{
		this.data=d;
		this.next=n;
	    }

		public Shape getData(){
			return data;
		}
		
        public void setData(Shape data) {
			this.data = data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}

		
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((data == null) ? 0 : data.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (data == null) {
				if (other.data != null)
					return false;
			} else if (!data.equals(other.data))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			return true;
		}	
    }
}





