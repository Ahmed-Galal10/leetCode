class Solution {
    public int finalValueAfterOperations(String[] operations) {
        Map<String, Integer> operationMap = new HashMap<>();
        operationMap.put("X++", 1);
        operationMap.put("++X", 1);
        operationMap.put("X--", -1);
        operationMap.put("--X", -1);
        
        int x = 0;
        for (String operation : operations){
            x += operationMap.get(operation);
        }

        return x;
    }
}