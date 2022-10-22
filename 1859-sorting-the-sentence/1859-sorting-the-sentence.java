class Solution {
    public String sortSentence(String s) {
        String[] splittedWords = s.split(" ");
        String[] sortedSentence = new String[splittedWords.length];
        for (String word : splittedWords) {
            sortedSentence[Character.getNumericValue(word.charAt(word.length() - 1)) -1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sortedSentence);
    }
}