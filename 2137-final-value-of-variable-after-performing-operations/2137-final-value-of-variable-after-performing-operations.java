class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String key : operations){
            if(key.equals("X++")) x++;
            else if(key.equals("++X")) ++x;
            else if(key.equals("X--")) x--;
            else --x;
        }
    return x;
    }
}