//Removing duplicates using HashSet and then adding the list to the final list (Brute Force)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for(int mask=0; mask < (1<<n); mask++)
        {
            list.clear();
            for(int i=0; i<n; i++)
            {
                if((mask & (1<<i))!=0)
                {
                    list.add(nums[i]);
                }
            }
            set.add(new ArrayList<>(list));
        }
        return new ArrayList<>(set);
    }
}

//Using Recursion + Backtracking + for loop(used for 'for loop backtracking' like generating subsets or generating combinations)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> res=new ArrayList<>();
       Arrays.sort(nums);
       backtracking(nums, 0, res, new ArrayList<>());
       return res;
    }
    public void backtracking(int[] nums, int i, List<List<Integer>> res, List<Integer> list)
    {
        res.add(new ArrayList<>(list));
        for(int j=i; j<nums.length; j++)
        {
            if (j > i && nums[j] == nums[j - 1]) 
                continue;
            list.add(nums[j]);
            backtracking(nums, j+1, res, list);
            list.remove(list.size()-1);
        }
    }
}
