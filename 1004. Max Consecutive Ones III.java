class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int countZero=0;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                countZero++;
            }
            if(countZero>k){
                if(nums[left]==0){
                    countZero--;
                }
                left++;
            }
        }
        return n-left;
    }
}
