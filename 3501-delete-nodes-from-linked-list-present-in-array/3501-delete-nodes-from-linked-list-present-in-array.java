class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> Set = new HashSet<>();
        for(int num : nums){
            Set.add(num);
        }
        while(head != null && Set.contains(head.val)){
            head = head.next;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        while(temp != null){
            if(Set.contains(temp.val)){
                prev.next = temp.next;
            }else{
                prev = temp;
            }
        temp = temp.next;
        }
    return head;
    }
}