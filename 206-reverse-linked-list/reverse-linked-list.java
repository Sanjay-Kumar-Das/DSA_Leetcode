/*
class Solution {
    static ListNode reverse(ListNode slow, ListNode fast){
        if(fast.next == null) return fast;
        reverse(slow.next,fast.next);
        fast.next = slow;
        return fast;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        return reverse(slow,fast);
    }
}
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}