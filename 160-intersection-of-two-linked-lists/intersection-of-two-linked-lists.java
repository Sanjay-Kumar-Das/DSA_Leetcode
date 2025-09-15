public class Solution {
    public int sizeOfLL(ListNode head, int size){
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA =0, sizeB = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        sizeA =sizeOfLL(temp1,sizeA);
        sizeB = sizeOfLL(temp2,sizeB);
        if(sizeA > sizeB){
            int n = sizeA-sizeB;
            for(int i=0;i<n;i++){
                headA = headA.next;
            }
        }else{
            int m = sizeB-sizeA;
            for(int i=0;i<m;i++){
                headB = headB.next;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}