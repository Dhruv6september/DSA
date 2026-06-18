class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums, visited,res, new ArrayList<>());
        return res;
    }
    public void backtracking(int[] nums, boolean[] visited, List<List<Integer>> res, List<Integer> list)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int j=0; j<nums.length; j++)
        {
            if(visited[j]==true)
                continue;
            if(j>0 && nums[j-1]==nums[j] && !visited[j-1])
                continue;
            visited[j]= true;
            list.add(nums[j]);
            backtracking(nums, visited, res, list);
            visited[j]=false;
            list.remove(list.size()-1);
        }
    }
}
