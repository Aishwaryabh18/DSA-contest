class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ex1 = -1;
        int ex2 = -1;

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                ex1 = i;
                if(ex2 != -1){
                    minDiff = Math.min(minDiff, Math.abs(ex1 - ex2));
                }
            }
            else if(nums[i] == 2){
                ex2 = i;
                if(ex1 != -1){
                    minDiff = Math.min(minDiff, Math.abs(ex1 - ex2));
                }
            }
        }
        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
        
        
    }
}