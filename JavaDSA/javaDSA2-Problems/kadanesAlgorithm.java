package javaDSA2;
//problem link: https://leetcode.com/problems/maximum-subarray/

// Maximum Sum of the subArray 


public class kadanesAlgorithm{
    public static void main(String[] args) {
        
    
    int[] nums={2, -3, 4, -2, 1};
    int max_sum=0, curr_sum=0;
    //int =0;
  for(int i=0; i< nums.length; i++){
        curr_sum+= nums[i];
            
            if(curr_sum > max_sum){
                max_sum=curr_sum;
            }
            else if( curr_sum< 0){
                curr_sum=0;
            }
    }
 

}
}

/*
// BRUTE Force
class Main
{
    // A naive solution to finding maximum subarray sum using
    // divide-and-conquer
    public static int findMaximumSum(int[] A)
    {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
 
        // do for each subarray starting with `i`
        for (int i = 0; i < A.length - 1; i++)
        {
            // calculate the sum of subarray `A[i…j]`
 
            sum = 0;    // reset sum
 
            // do for each subarray ending at `j`
            for (int j = i; j < A.length; j++)
            {
                sum += A[j];
 
                // if the current subarray sum is greater than the maximum
                // sum calculated so far, update the maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
 
        return maxSum;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, -4, 1, 9, -6, 7, -3 };
        System.out.println("The Maximum sum of the subarray is " + findMaximumSum(A));
    }
}

------------------------------------------------------------------------------------
// Divide and conquer
class Main
{
    // Function to find the maximum subarray sum using divide-and-conquer
    public static int findMaximumSum(int[] A, int left, int right)
    {
        // If the array contains only one element
        if (right == left) {
            return A[left];
        }
 
        // Find the middle array element
        int mid = (left + right) / 2;
 
        // Find maximum subarray sum for the left subarray,
        // including the middle element
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--)
        {
            sum += A[i];
            if (sum > leftMax) {
                leftMax = sum;
            }
        }
 
        // Find maximum subarray sum for the right subarray,
        // excluding the middle element
        int rightMax = Integer.MIN_VALUE;
        sum = 0;    // reset sum to 0
        for (int i = mid + 1; i <= right; i++)
        {
            sum += A[i];
            if (sum > rightMax) {
                rightMax = sum;
            }
        }
 
        // Recursively find the maximum subarray sum for the left
        // and right subarray, and take maximum
        int maxLeftRight = Integer.max(findMaximumSum(A, left, mid),
                                    findMaximumSum(A, mid + 1, right));
 
        // return the maximum of the three
        return Integer.max(maxLeftRight, leftMax + rightMax);
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, -4, 1, 9, -6, 7, -3 };
 
        System.out.println("The Maximum sum of the subarray is " +
                findMaximumSum(A, 0, A.length - 1));
 
    }
}



*/