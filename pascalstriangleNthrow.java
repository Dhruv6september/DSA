class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        long val=1;
        row.add(1);
        for(int i=1;i<=rowIndex;i++)  //Using relationship between Nth Row and binomial coefficients C(n,K)=C(n,k-1)*(n-k+1)/k 
        {
            long next_val=val*(rowIndex-i+1)/i;
            row.add((int)next_val); 
            val=next_val;
        }
        return row;
    }
}
