class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        if(size - n == 0) return temp.next;
        for(int i=1;i<size-n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}