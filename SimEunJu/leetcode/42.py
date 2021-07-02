class Solution:
    def trap(self, height: List[int]) -> int:
        
        if not height:
            return 0
        
        front = 0
        back = len(height) - 1
        frontMax = height[front]
        backMax = height[back]
        sum = 0
        
        while front < back:
            frontMax = max(frontMax, height[front])
            backMax = max(backMax, height[back])
            
            if frontMax <= backMax:
                sum += frontMax - height[front]
                front += 1
            else:
                sum += backMax - height[back]
                back -= 1
            
        
        return sum
