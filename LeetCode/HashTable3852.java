import java.util.*;
// class Solution {
    
// }

class Main{
    public static int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int min = Arrays.stream(nums).min().getAsInt();

        int freq_minVal = freq.get(min);
        int second_min = Integer.MAX_VALUE;
        for (int key : freq.keySet()) {
            if (key > min && freq.get(key) != freq_minVal) {
                second_min = Math.min(key, second_min);
            }
        }
        if (second_min == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        return new int[] { min, second_min };

    }

    public static void main(String[] args){
        // Solution sol = new Solution();
        int[] nums = {1,1,2,2,3,4};
        int[] res = minDistinctFreqPair(nums);
        System.out.println(Arrays.toString(res));
    }
}