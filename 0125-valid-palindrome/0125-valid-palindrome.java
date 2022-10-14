class Solution {
    public boolean isPalindrome(String phrase) {
        phrase  = phrase .toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if (!phrase .isEmpty()){
            for (int i = 0; i < (phrase .length() / 2); i++){
                if(phrase .charAt(i) != phrase .charAt(phrase .length() - i - 1)){
                    return false;
                }
            }
        }

        return true;
    }
}