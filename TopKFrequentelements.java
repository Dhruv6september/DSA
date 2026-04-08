class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int element=nums[i];
            if(map.containsKey(element))
            {
                int oldf=map.get(element);
                map.put(element, map.getOrDefault(element,0)+1);
            }
            else{
                map.put(element,1);
            }
        }
    PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
        (a,b)->b.getValue()-a.getValue()
    );
    pq.addAll(map.entrySet());
    List<Integer> temp=new ArrayList<>();
    while(!pq.isEmpty())
    {
        Map.Entry<Integer,Integer> mp=pq.poll();
        temp.add(mp.getKey());
    }
    int[] res=new int[k];
    for(int i=0;i<k;i++)
    {   
        res[i]=temp.get(i);
    }
    return res;
    }
}
