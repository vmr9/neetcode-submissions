class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestStreak=0;
        int streak=0;
        for(int num : nums){
            if(num==1){
                streak++;
                longestStreak=Math.max(streak, longestStreak);
            }
            else {
                streak=0;
            }
        }
        return longestStreak;
    }
}