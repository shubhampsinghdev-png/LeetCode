class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return null;
        head = head.next;
        ListNode temp = head;
        ListNode nodeNext = temp.next;
        while(temp != null){
            nodeNext = temp.next;
            while(nodeNext != null && nodeNext.val != 0){
                temp.val += nodeNext.val;
                nodeNext = nodeNext.next;
            }
            if (nodeNext.next != null) temp.next = nodeNext.next;
            else temp.next = null;
        temp = temp.next;
        }
    return head;
    }
}