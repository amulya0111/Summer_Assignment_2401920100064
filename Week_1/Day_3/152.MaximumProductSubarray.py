class Solution(object):
    def maxProduct(self, nums):
        output=nums[0]
        mini=nums[0]
        curr=nums[0]
        for i in range(1,len(nums)):
            if nums[i]<0:
                output,mini=mini,output
    
            output=max(nums[i],nums[i]*output)
            mini=min(nums[i]*mini,nums[i])
            curr=max(output,curr)  
        return curr  