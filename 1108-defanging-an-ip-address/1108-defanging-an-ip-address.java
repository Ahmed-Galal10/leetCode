class Solution {
    public String defangIPaddr(String address) {
        StringBuilder newAddress = new StringBuilder();
        for(char c : address.toCharArray()){
            newAddress.append(c == '.' ? "[.]" : c);
        }

        return newAddress.toString();
    }
}