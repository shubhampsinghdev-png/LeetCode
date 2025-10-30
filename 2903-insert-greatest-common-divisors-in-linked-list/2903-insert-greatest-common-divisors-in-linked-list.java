class Solution {
    public int gcd(int a, int b){
        while(b > 0){
            int temp = a % b;
                a = b;
                b = temp;
        }
    return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null){
            int gcdVal = gcd(first.val, second.val);
            ListNode mid = new ListNode(gcdVal);
            first.next = mid;
            mid.next = second;
            first = second;
            second = second.next;
        }
    return head;
    }
}