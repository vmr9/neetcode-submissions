class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int res = students.length;
        int[] count = new int[2];

        for(int student: students){
            count[student]++;
        }
        
        for(int sandwich: sandwiches){
            if(count[sandwich] > 0){
                count[sandwich]--;
                res--;
            } else {
                break;
            }
        }
        return res;
    }
}