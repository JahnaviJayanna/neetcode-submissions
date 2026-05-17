class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder tCharArray = new StringBuilder(t);
        char[] sCharArray = s.toCharArray();
        HashMap<String, Integer> sMap = new HashMap();
        for(char schar : sCharArray){
            String sVal = String.valueOf(schar);
            if(tCharArray.indexOf(sVal)==-1){
                return false;
            }
            tCharArray.deleteCharAt(tCharArray.indexOf(sVal));
        }
        return true;

    }
}
