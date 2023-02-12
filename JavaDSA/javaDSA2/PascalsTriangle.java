//leet code link: https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row=null; 
        List<Integer> prev = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
            //edge rows are always 1
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(prev.get(j - 1) + prev.get(j));
            
            //we have seen that row sum is sum of (j-1) and j index
            //whereas j+1 index is at 1
			prev = row;
            //assign previous to row
			res.add(row);
		}
		return res;
	}
        
    }
