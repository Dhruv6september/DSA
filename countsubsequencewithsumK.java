public class countsubsequenceswithsumK {
    public int countSubsequences(int[] nums, int k)
    {
        return func(0, k, nums);
    }
    public int func(int i, int sum, int[] nums)
    {
        if(sum==0)
            return 1;
        if(sum<0 || i==nums.length)
            return 0;
        return func(i+1, sum-nums[i], nums)+func(i+1, sum, nums);
    }
    public static void main(String[] args) {
        countsubsequenceswithsumK ob= new countsubsequenceswithsumK();
        int[] nums={1,3,2};
        int k=3;
        int res=ob.countSubsequences(nums, k);
        System.out.println("Number of existing subsequences: "+res);
    }
}
