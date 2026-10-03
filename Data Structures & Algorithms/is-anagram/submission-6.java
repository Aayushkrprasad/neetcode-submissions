class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ;

        }

    char []as = s.toCharArray();
    char []at = t.toCharArray();
    Arrays.sort(at);
    Arrays.sort(as);
    return Arrays.equals(at,as);

    }
}
