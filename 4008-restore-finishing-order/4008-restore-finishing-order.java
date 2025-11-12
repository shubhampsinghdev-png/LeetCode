class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : friends) set.add(i);
        int[] ans = new int[friends.length];
        int k = 0;
        for(int j : order){
            if(set.contains(j)) ans[k++] = j;
        }
    return ans;
    }
}