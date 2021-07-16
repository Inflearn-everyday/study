def solution(array, commands):
    res = []
    for start, end, nth in commands:
        subArr = array[start-1:end]
        subArr.sort()
        res.append(subArr[nth-1])
    return res
