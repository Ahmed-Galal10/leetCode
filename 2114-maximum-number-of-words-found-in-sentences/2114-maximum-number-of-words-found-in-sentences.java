class Solution {
    public int mostWordsFound(String[] sentences) {
        return Stream.of(sentences).mapToInt( sentence -> sentence.trim().split(" ").length)
                                    .max().getAsInt();
    }
}