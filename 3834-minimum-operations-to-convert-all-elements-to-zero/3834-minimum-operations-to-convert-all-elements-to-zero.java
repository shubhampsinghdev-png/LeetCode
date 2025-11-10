class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int num : nums){
            while(!stack.empty() && num < stack.peek()){
                stack.pop();
            }
            if(num == 0) continue;
            if(stack.empty() || num > stack.peek()){
                cnt++;
                stack.push(num);
            }
        }
    return cnt;
    }
}