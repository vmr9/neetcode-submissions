class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        int res = students.length;

        for(int student: students){
            count[student]++;
        }

        for(int sandwich: sandwiches){
            if(count[sandwich] > 0){
                res--;
                count[sandwich]--;
            } else {
                break;
            }
        }
        return res;
    }
}