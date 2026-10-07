class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        long windowSum=0;
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            windowSum+=nums[i];
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(i>=k){
               windowSum-=nums[i-k];
               freq.put(nums[i-k],freq.get(nums[i-k])-1);
               if(freq.get(nums[i-k])==0){
                freq.remove(nums[i-k]);
               }
            }
            if(i>=k-1 && freq.size()==k){
                ans=Math.max(ans,windowSum);
            }
        }
        return ans;
    }
}
