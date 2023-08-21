class Solution {
    public int[] decompressRLElist(int[] nums) {

        int length = 0;
        for(int i=0;i<nums.length;i=i+2)
        {
            length +=nums[i];
        }

        int[] result = new int[length];
        int count=0;

        for(int i=0; i<nums.length ;i +=2)
        {
            for(int j=0;j<nums[i];j++)
            {
                result[count] = nums[i+1];
                count++;
            }
        }
        return result;
        
    }
}