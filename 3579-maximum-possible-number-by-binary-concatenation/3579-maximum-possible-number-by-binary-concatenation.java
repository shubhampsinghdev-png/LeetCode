class Solution {
    public int BtoD(String str){
        int ans = 0;
        int i = str.length() -1;
        int pow = 1;
        while(i >= 0){
            int c = str.charAt(i) - '0';
            ans += pow* c;
            pow *= 2;
            i--;
        }
    return ans;
    }
    public int maxGoodNumber(int[] nums) {
        String str1 = Integer.toBinaryString(nums[0]);
        String str2 = Integer.toBinaryString(nums[1]);
        String str3 = Integer.toBinaryString(nums[2]);

        int ansMax = 0;
        StringBuilder res = new StringBuilder();
        res.append(str1).append(str2).append(str3);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);

        res.append(str1).append(str3).append(str2);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);

        res.append(str2).append(str1).append(str3);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);

        res.append(str2).append(str3).append(str1);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);

        res.append(str3).append(str2).append(str1);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);

        res.append(str3).append(str1).append(str2);
        ansMax = Math.max(ansMax, BtoD(res.toString()));
        res.setLength(0);
    return ansMax;
    }
}