import collections

def solution(n, edge):
    graph = collections.defaultdict(list)
    for v, u in edge:
        graph[v].append(u)
        graph[u].append(v)
    q = collections.deque(graph[1])
    depth = 1
    depthes = {i:0 for i in range(1, n+1)}
    while q:
        for i in range(len(q)):
            v = q.popleft()
            if depthes[v] == 0:
                depthes[v] = depth
                for w in graph[v]:
                    q.append(w)
        depth += 1
        
    depthes[1] = 0
    maxval = max(depthes.values())
    
    return list(depthes.values()).count(maxval)
