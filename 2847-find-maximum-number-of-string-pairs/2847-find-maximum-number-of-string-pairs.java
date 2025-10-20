class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(String str : words){
            StringBuilder res = new StringBuilder(str);
            String newStr = res.reverse().toString();
            if(set.contains(str) || set.contains(newStr)){
                count++;
            }else{
                set.add(str);
            }
        }
    return count;
    }
}