package algorithms.introduction.leetcode;

public class TwoSumByLinkedList {
	
	public static class ListNode{
		public int val;
		public ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode(0);
		ListNode root = pre;
		int carry = 0;
		while (l1!=null || l2!=null || carry!=0) {
			ListNode curListNode = new ListNode(0);
			int sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
			curListNode.val=sum%10;
			carry = sum/10;
			pre.next = curListNode;
			pre = curListNode;
			
			l1=(l1 == null)?l1:l1.next;
			l2=(l2 == null)?l2:l2.next;
		}
		return root.next;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);  
        ListNode l2=new ListNode(4);  
        ListNode l3=new ListNode(3);  
        l1.next=l2;  
        l2.next=l3;  
         
        ListNode l4=new ListNode(5);  
        ListNode l5=new ListNode(6);  
        ListNode l6=new ListNode(4);  
        l4.next=l5;  
        l5.next=l6;  
        ListNode l7= TwoSumByLinkedList.addTwoNumbers(l1,l4);  
         
        while(l7!=null){  
            System.out.println(l7.val);  
            l7=l7.next;  
        }  
	}

}
