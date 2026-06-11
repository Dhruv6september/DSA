class checksubsequencewithsumk
{
    public boolean subsequenceExists(int[] nums, int target)
    {
        return isSubsequence(0,target,nums);
    }
    public boolean isSubsequence(int i, int sum, int[] nums)
    {
        if(sum==0)
            return true;
        if(sum<0 || i==nums.length)
            return false;
        return isSubsequence(i+1, sum-nums[i], nums) || isSubsequence(i+1, sum, nums);
    }
    public static void main(String[] args) {
        checksubsequencewithsumk ob=new checksubsequencewithsumk();
        int[] nums={1,4,2};
        int k=3;
        boolean res=ob.subsequenceExists(nums, k);
        if(res==true)
            System.out.println("Subsequence exists");
        else 
            System.out.println("No Subsequence exits");
    }
}
