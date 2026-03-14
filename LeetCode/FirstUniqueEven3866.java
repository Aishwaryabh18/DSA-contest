class Main {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i,0) + 1 );
        }

        for(int n : nums){
            if(n % 2 == 0 && freq.get(n) == 1){
                return n;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,4,2,5,4,6};
        int res = firstUniqueEven(nums);
        System.out.println(res);
    }
}