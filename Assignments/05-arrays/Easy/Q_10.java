class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) {
            return false;
        }
        for(char c='a'; c<='z'; c++) {
            if(!sentence.contains(""+c)) {
                return false;
                }
            }
        return true;
    }
}