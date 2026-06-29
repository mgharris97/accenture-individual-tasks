/**
 * studentMarkTracker
 */
public class studentMarkTracker {
    public static void main(String[] args) {
    int[][] grades = { {7, 7, 6}, {4, 9, 10}, {4, 3, 9} };

    for (int i = 0; i < grades.length; i++)
    {
        int result = (int) Math.round(average(grades[i]));
        switch (result) {
            case 1:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Unsatisfactory");
                break;
            case 2:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Unsatisfactory");
                break;
            case 3:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Unsatisfactory");
                break;
            case 4:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Almost Satisfactory");
                break;
            case 5: 
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Satisfactory");
                break;
            case 6: 
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Almost Good");
                break;
            case 7:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Good");
                break;
            case 8:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Very Good");
                break;
            case 9:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :Excellent");
                break;
            case 10:
                System.out.println("Student " + (i+1) + " Avg: " + Math.round(result) + " :With Distinction");
                break;
            default:
                break;
        }

    }

}
static double average (int[] nums)
    {
        int total = 0;
        for (int value:nums)
        {
            total += value;
        }
        double result = (double) total / nums.length;
        return result;
    }



    


    



    
}