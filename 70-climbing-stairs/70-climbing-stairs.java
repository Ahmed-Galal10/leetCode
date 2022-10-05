class Solution {
    public int climbStairs(int n) {
        if(n < 4){
            return n;
        }
        
        int firstStep = 0;
        int secondStep = 1;
        int totalSteps = firstStep + secondStep;
        int step = 0;
        while(step < n){
            totalSteps = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = totalSteps;
            step++;
        }
        
        return totalSteps;
    }
}