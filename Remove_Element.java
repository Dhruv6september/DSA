class solution{
public int removeElement(int[] nums, int val) {
        int j=0;
        if(nums.length==0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                j=i;
                break;
            }
        }
        if(nums[j]!=val)
        {
            return nums.length;
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args)
    {
        solution ob=new solution();
        int ar[]={0,1,2,3,4,3,6,8,9,2,2,3,5,2,2};
        int val=2;
        int result=ob.removeElement(ar, val);
        for(int i=0;i<result;i++)
            System.out.print(ar[i]+" ");
    }
}
