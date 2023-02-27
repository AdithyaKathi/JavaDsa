public class MiddleSingle
{
    public static class Node{
        int data;
        Node next;
        public Node(int x){
            data = x;
            next = null;
        }
    }
    
    public static void rPrint(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" -> ");
        rPrint(head.next);
    }
    
    public static Node deleteBegin(Node head){
        if(head == null || head.next == null){return null;}
        
        return head.next;
    }
    
    public static Node deleteEnd(Node head){
        if(head == null || head.next == null){return head;}
        Node curr = head;
        while(curr.next != null  && curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    
    public static void printMid(Node head){
        Node slow = head , fast = head;
        if(head == null){
            return;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }
    
    
	public static void main(String[] args) {
		Node head = new Node(1);
		Node el1  = new Node(2);
		Node el2  = new Node(3);
		head.next = el1;
		el1.next = el2;
		System.out.print("Elements In The Linked List : ");
		rPrint(head);
	/*	head = deleteEnd(head);
		head = deleteEnd(head);
		rPrint(head);*/
		System.out.println();
		System.out.print("Middle Element Of The Linked List : ");
		
		printMid(head);
	    
	}
}