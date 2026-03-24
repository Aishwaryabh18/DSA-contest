// koko eating bananas Binary search

 static int findMinK(int[] piles, long H) {
     int r = Integer.MIN_VALUE;
     for (int p: piles) {
         r = Math.max(r, p);
     }
     int l = 1; //1 to maxval in piles

     int ans = r;
     while (l <= r) {
         int k = l + (r - l) / 2;
         long totalHr = 0;
         for (int p: piles) {
             totalHr += (p + k - 1) / k; //ceil(p/k) , calculate (&accumulate) k hrs for every pile with k
         }

         if (totalHr <= H) { //check possibility
             ans = k;
             r = k - 1;
         }
         else {
             l = k + 1;
         }
     }
     return ans;
 }