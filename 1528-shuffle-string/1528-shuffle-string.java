import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;


class Solution {
    public String restoreString(String originalString, int[] indices) {
        SortedMap<Integer, String> sortedIndicesWithChars = matchingIndicesWithStrings(originalString, indices);
        
        return concateMapValues(sortedIndicesWithChars);
        
    }

    static SortedMap<Integer, String> matchingIndicesWithStrings(String originalString, int[] indices){
        SortedMap<Integer, String> sortedIndicesWithChars = new TreeMap<>();

        for (int c = 0; c < originalString.length(); c++) {
            sortedIndicesWithChars.put(indices[c], String.valueOf(originalString.charAt(c)));
        }
        return sortedIndicesWithChars;
    }

    static String concateMapValues(SortedMap<Integer, String> sm){
        return sm.values().stream().collect(Collectors.joining(""));
    }
}