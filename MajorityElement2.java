class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int mini=n/3 + 1;  //Acts as a threshold. Add the element as soon as it crosses the majority threshold(n/3), that is (n/3)+1. 
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==mini)
                result.add(nums[i]);
            if(result.size()==2)
                break;
        }
        return result;
    }
}
