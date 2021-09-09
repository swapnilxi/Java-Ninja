package JavaDSA;

public class sortColor {
    public void main (String[] args ) {
        int[] nums= new int[]{1,0,1,0,1};

        // use of dutch flag algo 
        //3 pointers
        int low = 0; 
        int high = nums.length - 1; 
        int md = 0; 
        int temp; 
        while (md <= high) { 
            switch (nums[md]) { 
                case 0: { 
                    temp = nums[low]; 
                    nums[low] = nums[md]; 
                    nums[md] = temp; 
                    low++; 
                    md++; 
                    break; 
                } 
                case 1: 
                    md++; 
                    break; 
                case 2: { 
                    temp = nums[md]; 
                    nums[md] = nums[high]; 
                    nums[high] = temp; 
                    high--; 
                    break; 
                } 
            } 
        }
    }
}
