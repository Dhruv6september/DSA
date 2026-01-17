import java.util.HashSet;

public class removingduplicates {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        int index=0; //to check for unique number of elements
        for(int num: nums)
        {
            if(seen.contains(num)==false)
            {
                seen.add(num);
                nums[index]=num; //overwriting nums with elements that are not there in the HashSet
                index++;
            }
        }
        return index; //returns unique number of elements
    }

    public static void main(String[] args) {
        removingduplicates ob=new removingduplicates();
        int nums[]={1,1,2,3,4,5,5,5,7,8,9,9};
        int k=ob.removeDuplicates(nums);
        System.out.println("Number of Unique elements: "+k);
        for(int i=0; i<k; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
