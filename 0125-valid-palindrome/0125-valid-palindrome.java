class Solution {
    public boolean isPalindrome(String s) {
        String filter = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder res = new StringBuilder(filter);
        String og = res.reverse().toString();
        return filter.equals(og);
    }
}