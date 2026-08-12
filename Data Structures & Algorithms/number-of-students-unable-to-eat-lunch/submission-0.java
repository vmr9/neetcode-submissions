class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int[] count = new int[2];
        for(int student: students){
            count[student]++;
        }
        int eaten = 0;
        for(int sandwich: sandwiches){
            if(count[sandwich] > 0){
                count[sandwich]--;
                eaten++;
            } else {
                break;
            }
        }
        return sandwiches.length - eaten;
    }
}