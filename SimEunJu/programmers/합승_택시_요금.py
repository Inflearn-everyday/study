import heapq
import collections

def dijkstra(graph, s, n):
    
    Q = [(0, s)]
    dist = [int(10e9) for _ in range(n+1)]
    dist[s] = 0
    
    while Q:
        time, node = heapq.heappop(Q)
        if dist[node] < time:
            continue
        for v, w in graph[node]:
            alt = time + w
            if alt < dist[v]:
                dist[v] = alt
                heapq.heappush(Q, (alt, v))
    
    return dist
    
def solution(n, s, a, b, fares):
    
    graph = collections.defaultdict(list)
    for u, v, w in fares:
        graph[u].append((v,w))
        graph[v].append((u,w))
        
    ans = int(10e9)
    for v in range(1, n+1):
        dist = dijkstra(graph, v, n)
        ans = min(ans, dist[s] + dist[a] + dist[b])
        
    return ans
    
