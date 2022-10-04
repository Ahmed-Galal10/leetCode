class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumResult = new int[2];
        
        outer:
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < nums.length; j++){
                    if(i == j){
                        continue;
                    }
                    if(nums[i] + nums[j] == target ){
                        sumResult[0] = i;
                        sumResult[1] = j;
                        break outer;
                    }
                }
            }
        return sumResult;
    }
}