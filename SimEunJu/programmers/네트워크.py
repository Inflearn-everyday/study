import collections

def solution(n, computers):
    graph = collections.defaultdict(list)
    
    for row in range(0, n):
        for col in range(0, n):
            if row != col and computers[row][col] == 1:
                graph[row].append(col)
    
    visited = [False for _ in range(0, n)]
    
    def findDfs(idx):
        if visited[idx] == True:
            return False
        if graph[idx]:
            visited[idx] = True
            for next in graph[idx]:
                if findDfs(next) == True:
                    return True
        return False
        
    res = 0
    for idx in range(0, n):
        if visited[idx] == False:
            findDfs(idx)
            res += 1
        
    return res
