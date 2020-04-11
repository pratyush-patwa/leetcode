import java.util.*;
class DecompressLength {
    public static int [] decompressRLElist(int[] nums) {
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
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int [] nums = new int[n];
        for(int i=0; i< n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(decompressRLElist(nums));
    }
}
