class movezeroes {
    public void moveZeroes(int[] nums) {
        int j=-1; //twopointer approach
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return;
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        movezeroes ob=new movezeroes();
        int[] ar={1,0,2,3,0,2,3,4,0,2,1,0};
        ob.moveZeroes(ar);
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
}
