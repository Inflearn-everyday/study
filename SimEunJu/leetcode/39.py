class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        
        def sumDfs(sum, path, idx):
            if sum > target:
                return 
            
            if sum == target:
                result.append(path)
                return
            
            for i in range(idx, len(candidates)):
                sumDfs(sum+candidates[i], path+[candidates[i]], i)
        
        sumDfs(0, [], 0)
        return result
