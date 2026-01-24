public class rearrangesign {
    public int[] rearrange(int[] nums, int n)
    {
        int pos=0;
        int neg=1;
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                temp[neg]=nums[i];
                neg=neg+2;
            }
            else
            {
                temp[pos]=nums[i];
                pos=pos+2;
            }
            if(pos>n && neg>n)
                break;
        }
        return temp;
    }
    public static void main(String[] args) {
        rearrangesign ob=new rearrangesign();
        int arr[]={1,2,-4,-5};
        int n=arr.length;
        int[] rearranged=ob.rearrange(arr, n);
        for(int num: rearranged)
        {
            System.out.print(num+" ");
        }
    }
}
// Brute force:
        // List<Integer> pos=new ArrayList<>();
        // List<Integer> neg=new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]<0)
        //         neg.add(nums[i]);
        //     else
        //         pos.add(nums[i]);
        // }
        // for(int i=0;i<n/2;i++)
        // {
        //     nums[2*i]=pos.get(i);
        //     nums[2*i+1]=neg.get(i);
        // }
        // return nums;
