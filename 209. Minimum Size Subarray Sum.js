var minSubArrayLen = function(target, nums) {
        let n=nums.length;
        let sum=0;
        let left=0;
        let minLen=Number.MAX_SAFE_INTEGER;
        for(let right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLen==Number.MAX_SAFE_INTEGER?0:minLen;
};
