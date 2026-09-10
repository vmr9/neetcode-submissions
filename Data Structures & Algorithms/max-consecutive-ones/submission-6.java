class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int max = 0;
        for(int num: nums){
            if(num == 1){
                n++;
                max = Math.max(n, max);
            } else {
                n = 0;
                max = Math.max(n, max);
            }
        }
        return max;
    }
}