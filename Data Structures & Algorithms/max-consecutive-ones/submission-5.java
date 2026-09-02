class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int max = 0;
        for(int num: nums){
            if(num == 1){
                i++;
                max = Math.max(i, max);
            } else{
                i = 0;
            }
        }
        return max;
    }
}