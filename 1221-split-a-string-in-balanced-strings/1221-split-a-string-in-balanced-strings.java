class Solution {
    public int balancedStringSplit(String s) {
        int maxBalancedString = 0;
        int balanced = 0;
        for (char c: s.toCharArray()) {
            balanced += c == 'R' ? 1 : -1;
            if(balanced == 0){
                maxBalancedString++;
            }
        }

        return maxBalancedString;
    }
}