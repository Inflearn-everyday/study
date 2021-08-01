def solution(prices):
    stack = []
    res = [0 for i in range(len(prices))]
    
    for idx, val in enumerate(prices):
        if idx < 1:
            stack.append((idx, val))
            continue
            
        while stack and stack[-1][1] > val:
            last = stack.pop(-1)
            res[last[0]] = idx - last[0]
    
        stack.append((idx, val))
    
    for idx, val in stack:
        res[idx] = len(prices) - 1 - idx
    
    return res
        
