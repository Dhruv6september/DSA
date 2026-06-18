class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(nums, res, new ArrayList<>());
        return res;
    }
    public void backtracking(int[] nums, List<List<Integer>> res, List<Integer> list)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int j=0; j<nums.length; j++)
        {
            if(list.contains(nums[j]))
                continue;
            list.add(nums[j]);
            backtracking(nums, res, list);
            list.remove(list.size()-1);
        }
    }
}
