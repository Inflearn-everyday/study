# 43165 깊이/너비 우선 탐색(DFS/BFS) > 타겟 넘버

from collections import deque

def solution(numbers, target):
    answer = 0
    q = deque([(0,0)])
    while q:
        idx, tmp_sum = q.popleft()
        if idx > len(numbers):
            break
        elif idx == len(numbers) and tmp_sum == target:
            answer += 1
        elif idx < len(numbers):
            q.append((idx+1, tmp_sum-numbers[idx]))
            q.append((idx+1, tmp_sum+numbers[idx]))
    return answer