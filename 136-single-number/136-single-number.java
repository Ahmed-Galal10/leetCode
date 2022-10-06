class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> newNums = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!newNums.contains(nums[i])){
                newNums.add(nums[i]);
            } else {
                newNums.remove(Integer.valueOf(nums[i]));
            }
        }

        return newNums.get(0);
    }
}