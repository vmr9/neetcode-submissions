class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int n = 0;
        for(int i=arr.length-1; i>=0; i--){
            n = arr[i];
            arr[i]=max;
            max=Math.max(n, max);
        }
        return arr;
    }
}