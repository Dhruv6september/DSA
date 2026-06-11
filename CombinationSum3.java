class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        func(n, 1, num, k, res);
        return res;
    }
    public void func(int sum, int i, List<Integer> num, int k, List<List<Integer>> res)
    {
        if(sum==0 && num.size()==k)
        {
            res.add(new ArrayList<>(num));
            return;
        }
        if(sum<=0 || num.size()>k)
            return;
        for(int j=i; j<=9; j++)
        {
            if(j<=sum)
            {
                num.add(j);
                func(sum-j, j+1, num, k, res);
                num.remove(num.size()-1);
            }
            else 
                break;
        }
    }
}
