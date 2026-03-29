//3884. First Matching Character From Both Ends 
class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        for(int i=0; i< n/2; i++){
            if(s.charAt(i) == s.charAt(n-i-1)){
                return i;
            }
            
        }
        if(n%2==1) return n/2;

        return -1;
    }
}