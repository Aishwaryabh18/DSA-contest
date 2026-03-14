class Main {
    public static long gcd(long val, long maxi) {
        while (maxi != 0) {
            long temp = maxi;
            maxi = val % maxi;
            val = temp;
        }
        return val;
    }

    public long gcdSum(int[] nums) {
        List<Long> list = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            list.add(gcd(nums[i], max));
        }
        Collections.sort(list);
        int l=0;
        int r = list.size() -1;
        long sum =0;
        while (l < r) {
            sum+=gcd(list.get(l), list.get(r));
            l++;
            r--;
        }
        return sum;
    }

     public static void main(String[] args){
        int[] nums = {3,6,2,8};
        long res = gcdSum(nums);
        System.out.println(res);
    }
}