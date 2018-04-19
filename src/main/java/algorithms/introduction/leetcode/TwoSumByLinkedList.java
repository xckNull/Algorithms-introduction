package algorithms.introduction.leetcode;

/**
 * leetcode
 * 
 * @author xck 
 * 
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 */
public class TwoSumByLinkedList {

	public static class ListNode {
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
		while (l1 != null || l2 != null || carry != 0) {
			ListNode curListNode = new ListNode(0);
			int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			curListNode.val = sum % 10;
			carry = sum / 10;
			pre.next = curListNode;
			pre = curListNode;

			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}
		return root.next;
	}

}
