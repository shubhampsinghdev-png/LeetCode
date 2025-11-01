class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            if(!set.contains(temp.val)) list.add(temp.val);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(list.get(0));
        ListNode check = dummy;
        for(int i = 1; i<list.size(); i++){
            check.next = new ListNode(list.get(i));
            check = check.next;  
        }
    return dummy;
    }
}