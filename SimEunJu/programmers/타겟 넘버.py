res = 0

def solution(numbers, target):
    
    def dfs(idx, val):
        
        global res
        
        if idx >= len(numbers):
            if val == target:
                res += 1
            return

        add = dfs(idx+1, val + numbers[idx])
        sub = dfs(idx+1, val - numbers[idx])
    
    dfs(0,0)
    
    return res
