public int[] twoSum(int[] nums, int target) {
    
    /*******************************************************************************************
    
    SOLUTION OVERVIEW:
    
    We are given an integer array 'nums' along with an integer 'target'. We are tasked with
    finding the two numbers from 'nums' which add up to 'target'. We are expected to return the
    indices of these two numbers as an array.
    
    Our solution will be based around the idea of finding a number's complement.
    For nums[i], its complement is equal to 'target' - nums[i].
    
    If we are given a target of 10 and have 6 in 'nums', its complement would be 4 because 10 - 6 = 4.
    
    For our solution, we will store each visited number in 'nums' in a HashMap. 
    More specifically, we will store nums[i] as the key and 'i' as the value.
    
    This way, we can quickly look up the index at which a given number is stored at in 'nums' without
    needing to do a linear pass over 'nums'.
    
    For each number nums[i] we see in 'nums', we will check if we have already seen its complement,
    'target' - nums[i], during our linear pass of 'nums'. 
    
    If we find that nums[i] has its complement already stored in our map, we have found the two 
	numbers which add up to 'target'. We know the index of nums[i], and can easily look up the index 
	for the complement using our map.
    
    Otherwise, we add nums[i] to our map and continue with our linear pass.
    
    *******************************************************************************************/
    
    // 'res' will store the indices of the two numbers.
    int[] res = new int[2];
    
    // 'map' will map each value in 'nums' to its respective index.
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // Perform a linear pass of 'nums' to find the solution.
    for (int i=0; i < nums.length; i++) {
        
        // Check if we have already seen the complement of nums[i]
        if (map.containsKey(target - nums[i])) {
            // We have a found a pair of numbers in 'nums' which add up to 'target'.
            
            // Our solution calls of the indices of these numbers.
            // We have the index of nums[i] from i.
            res[0] = i;
            
            // We can look up the index of the complement in 'map'.
            res[1] = map.get(target - nums[i]);
            
            // We have a solution, so no need to look at the rest of 'nums'.
            break;
        } else {
            // We have not seen the complement of this number yet, so let's store it in 'map'
            // and continue looking at the rest of 'nums'.
            map.put(nums[i], i);
        }
    }
    
    // Return the two indices of the numbers which add up to 'target'.
    return res;
    
