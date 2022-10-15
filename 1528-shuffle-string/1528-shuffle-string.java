import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;


class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder originalString = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            originalString.setCharAt(indices[i], s.charAt(i));
        }
        
        return originalString.toString();
    }
}