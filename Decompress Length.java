class Solution {
    public int [] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i=0; i<nums.length; i+=2){
            size += nums[i];
        }
        int [] arr = new int[size];
        int idx =0;
        for(int i = 0; i<nums.length; i+=2){   
            while(nums[i]>0){
                     arr [idx] = nums[i+1];
                     idx++;
                     nums[i]--;   
            }   
        }
        return arr;
    }
}
