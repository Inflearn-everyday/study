import heapq

def solution(scoville, K):
    heap = list()
    for s in scoville:
        heapq.heappush(heap, s)
            
    cnt = 0;
    while len(heap) > 1:
        s1 = heapq.heappop(heap)
        s2 = heapq.heappop(heap)

        if s1 >= K and s2 >= K:
            heapq.heappush(heap, s1)
            heapq.heappush(heap, s2)
            break;
            
        mixed = s1 + s2 * 2
        cnt += 1
        heapq.heappush(heap, mixed)
            
    if len(heap) == 1 and heap[0] < K:
        return -1
    
    return cnt   
    
