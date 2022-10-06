class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(int i : nums){
            if(!numsSet.contains(i)){
                numsSet.add(i);
            } else {
                numsSet.remove(i);
            }
        }

        return numsSet.iterator().next();

    }
}