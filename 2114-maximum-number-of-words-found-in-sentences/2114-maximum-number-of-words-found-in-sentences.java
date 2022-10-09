class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        int sentenceWords;

        for (String sentence : sentences){
            sentenceWords = sentence.split(" ").length;
            if(sentenceWords > maxWords){
                maxWords = sentenceWords;
            }
        }
        return maxWords;
    }
}