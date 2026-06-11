class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        findCombination(0, target, candidates, res, ds);
        return res;
    }
    public void findCombination(int i, int target, int[] candidates, List<List<Integer>> ans, List<Integer> ds)
    {
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
            }
        for(int j=i;j<candidates.length;j++)
        {
            if(j>i && candidates[j]==candidates[j-1])
                continue;
            if(candidates[j]>target) //since the array is sorted, at any point if there is an element greater than the target, break out of the loop as no elements can be a part of a valid combination
                break;
            ds.add(candidates[j]);
            findCombination(j+1, target-candidates[j], candidates, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
