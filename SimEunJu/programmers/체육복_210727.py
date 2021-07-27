def solution(n, _lost, _reserve):
    
    lostSet = set(_lost)
    reserveSet = set(_reserve)
    
    lost = lostSet - reserveSet
    reserve = reserveSet - lostSet
    
    for r in reserve:

        if r - 1 in lost:
            lost.remove(r - 1)
        elif r + 1 in lost:
            lost.remove(r + 1)
    
    return n - len(lost)
