public class maxsubarray {
    public int maximumsubarrsum(int[] nums)
    {
        long maxsum=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>maxsum)
                maxsum=sum;
            if(sum<0)
                sum=0;
        }
        return (int)maxsum;   }

    public static void main(String[] args) {
        maxsubarray ob=new maxsubarray();
        int[] arr={2, 3, 5, -2, 7, -4};
        int result=ob.maximumsubarrsum(arr);
        System.out.println(result);
    }
}
