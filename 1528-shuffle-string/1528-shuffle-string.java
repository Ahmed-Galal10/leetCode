import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;


class Solution {
    public String restoreString(String originalString, int[] indices) {
        char[] charArray = new char[indices.length];
        for (int i=0; i < indices.length; i++){
            charArray[indices[i]] = originalString.charAt(i);
        }
        
        return new String(charArray);
    }
}