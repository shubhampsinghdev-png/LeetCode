class Solution{
    public int[] give(int n){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        int[] ans = {product, sum};
    return ans;
    }
    public int subtractProductAndSum(int n) {
        int[] result = give(n);
        return result[0] - result[1];
    }
}