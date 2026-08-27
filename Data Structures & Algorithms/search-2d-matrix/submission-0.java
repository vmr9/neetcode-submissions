class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bot = rows - 1;

        int c = 0;

        while(top <= bot) {
            c = (top+bot)/2;
            if(target > matrix[c][cols-1]) {
                top = c+1;
            } else if(target < matrix[c][0]) {
                bot = c-1;
            } else {
                break;
            }
        }
        
        if(!(top <= bot)) {
            return false;
        }

        int l = 0;
        int r = cols-1;

        while(l <= r) {
            int m = (l+r)/2;
            if(target > matrix[c][m]) {
                l = m+1;
            } else if(target < matrix[c][m]) {
                r = m-1;
            } else {
                return true;
            }
        }

        return false;
    }
}
