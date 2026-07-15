class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>i; j--){
                max=Math.max(max, arr[j]);
            }
            arr[i]=max;
            max=0;
            if(i==arr.length-1){
                arr[i]=-1;
            }
        }
        return arr;
    }
}