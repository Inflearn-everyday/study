class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        front = [nums[0]]
        back = [nums[-1]]
        
        for i in range(1, len(nums)):
            front.append(front[-1] * nums[i])
            back.append(back[-1] * nums[-1-i])

        result = []
        back.reverse()
        for i in range(0, len(nums)):
            val = 1
            if i-1 >= 0:
                val *= front[i-1]
            if i+1 < len(nums):
                val *= back[i+1]

            result.append(val)

        return result
