//Using BitMasking (Brute force Approach)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int mask=0; mask < (1<<n); mask++) //generating each mask
        {
            for(int i=0; i<n; i++) //For each mask, we check bit position, if the bit is set, we include it. Otherwise skip it
            {
                if((mask & (1<<i))!=0) //performs AND opertion on each bit, plus left shift
                    list.add(nums[i]);
            }
            res.add(new ArrayList<>(list));
            list.clear();
        }
        return res;
    }
}

//Using Recursion + Backtracking + Pick/Not Pick Approach
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        backtracking(nums, 0, res, new ArrayList<>());
        return res;
    }
    public void backtracking(int[] nums, int i, List<List<Integer>> res, List<Integer> list)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        backtracking(nums, i+1, res, list); //pick 

        list.remove(list.size()-1); //remove last inserted element to explore more paths
        backtracking(nums, i+1, res, list); //not pick 
    }
}
