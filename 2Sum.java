import java.util.HashMap;
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
                return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        twosum ob=new twosum();
        int[] arr={1,2,4,5,6};
        int target=9;
        int result[]=ob.twoSum(arr, target);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(arr[result[i]]+" ");
        }
    }
}
