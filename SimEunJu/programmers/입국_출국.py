def solution(enter, leave):

    result = [0 for _ in range(len(enter))]
    stack = []
    ei = 0
    
    for l in leave:
        
        while l not in stack:
            stack.append(enter[ei])
            ei += 1
        
        stack.remove(l) 
        for s in stack:
            result[s-1] += 1
        result[l-1] += len(stack)
        
    return result
