package javaDSA2;

public class RemovingLinkedList {
    //with dummy node 
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(head != null){
           if(head.val != val){
               cur.next = head;
               cur = cur.next;
           }
            head = head.next;
        }
        cur.next = null;
        return dummy.next;
    }
// without dummy node
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode curr = head;
        while (curr != null && curr.next != null)
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        return head;
    }
}
    
}
