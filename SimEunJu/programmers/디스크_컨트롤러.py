import heapq

def solution(jobs):
    jobs.sort(key=lambda job: job[0])
    heap = []
    start = -1
    end = 0
    ans = 0
    idx = 0
    while idx < len(jobs):
        for job in jobs:
            if start < job[0] <= end:
                heapq.heappush(heap, (job[1], job[0]))
        if heap:
            _job = heapq.heappop(heap)
            start = end
            end += _job[0]
            ans += end - _job[1]
            idx += 1
        else:
            end += 1
            
    return int(ans / len(jobs))
