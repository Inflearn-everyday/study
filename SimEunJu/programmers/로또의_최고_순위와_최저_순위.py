def solution(lottos, win_nums):
    matchCnt = 0
    zeroCnt = 0
    
    for lotto in lottos:
        if lotto == 0:
            zeroCnt += 1
        elif lotto in win_nums:
            matchCnt += 1
            
    highRank = min(6 - matchCnt - zeroCnt + 1, 6)
    lowRank = min(6 - matchCnt + 1, 6)
    
    return [highRank, lowRank]
