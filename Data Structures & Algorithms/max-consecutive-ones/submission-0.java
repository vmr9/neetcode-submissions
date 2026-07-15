class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestStreak=0;
        int streak=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0){
                streak=0;
            }
            if(nums[i]==1){
                streak++;
            }
            if(streak > longestStreak){
                longestStreak=streak;
            }
        }
        return longestStreak;
    }
}