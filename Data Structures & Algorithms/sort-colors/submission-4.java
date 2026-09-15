class Solution {
    public void sortColors(int[] nums) {
        
        int[] arr = new int[3];
        int index = 0;

        for(int num: nums){
            arr[num]++;
        }

        for(int i = 0; i < arr.length; i++){
            while(arr[i]-- > 0){
                nums[index++] = i;
            }
        }
    }
}