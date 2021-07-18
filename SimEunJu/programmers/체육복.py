def solution(n, _lost, _reserve):
    
    lost_ = set(_lost)
    reserve_ = set(_reserve)
    
    lost = list(lost_ - reserve_)
    reserve = list(reserve_ - lost_)
    
    lost.sort()
    reserve.sort()
    ridx = 0
    
    for l in lost:
        
        while(ridx < len(reserve)-1 and reserve[ridx] < l):
            ridx += 1
            
        if l-1 == reserve[ridx-1]:
            reserve[ridx-1] = -1
        elif l+1 == reserve[ridx]:
            reserve[ridx] = -1
    
    return n - (len(lost) - reserve.count(-1))
