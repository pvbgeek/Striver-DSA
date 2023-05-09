class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int res=0;
        int count=1;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[res] == nums[i])
            {count++;}
            else
            {count--;}

            if(count==0)
            {res=i; count=1;}
        }

        return nums[res];
        /*count=0;

        for(int i=0; i<nums.length;i++)
        {
            if(arr[i]==arr[res])
            {count++;}
        }

        if(count <= (nums.length)/2)
        {return -1}
        else
        {return arr[res];}*/    
    }
}