import heapq

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        graph = collections.defaultdict(list)
        
        for u, v, w in times:
            graph[u].append((v, w));
           
        visited = collections.defaultdict(int)
        # DFS
        queue = [(0, k)]
        while queue:
            cost, node = heapq.heappop(queue)
            if node not in visited:
                visited[node] = cost
                for v, w in graph[node]:
                    heapq.heappush(queue, (w+cost, v))
                    
        if len(visited) == n:
            return max(visited.values())
        return -1
            
