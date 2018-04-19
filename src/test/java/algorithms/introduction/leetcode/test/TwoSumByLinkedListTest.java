package algorithms.introduction.leetcode.test;

import org.junit.Test;

import algorithms.introduction.leetcode.TwoSumByLinkedList;
import algorithms.introduction.leetcode.TwoSumByLinkedList.ListNode;

public class TwoSumByLinkedListTest {

	@Test
	public void testTwoSumByLinkedList(){
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
