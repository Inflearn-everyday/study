from itertools import permutations

def solution(numbers):
    
    nums = [num for num in numbers]
    numList = []
    for i in range(1, len(numbers) + 1):
        numList += [int(''.join(numTuple)) for numTuple in permutations(nums, i)]  
    numSet = set(numList)
    
    res = 0
    for num in numSet:
        if num == 0 or num == 1:
            continue
            
        half = num // 2;
        divisor = 2;
        
        while divisor <= half and num % divisor != 0:
            divisor += 1
        
        if divisor - 1 == half:
            res += 1
    
    return res
