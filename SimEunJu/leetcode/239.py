class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res = []
        maxVal = float('-inf')
        
        for i in range(k, len(nums)+1):
            #print(nums[i-k:i])
            if maxVal == float('-inf'):
                maxVal = max(nums[i-k:i])
            elif nums[i-1] > maxVal:
                maxVal = nums[i-1]
                
            res.append(maxVal)
            
            if maxVal == nums[i-k]:
                maxVal = float('-inf')
            
            
        return res
