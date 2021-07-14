import heapq

class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        
        graph = collections.defaultdict(list)
        
        for _from, _to, _price in flights:
            graph[_from].append((_price, _to))
            
        queue = [(0, src, k)]
        
        while queue:
            _price, _to, _stop = heapq.heappop(queue)
            if _to == dst:
                return _price;
            if _stop >= 0:
                for p, t in graph[_to]:  
                    heapq.heappush(queue, (_price+p, t, _stop-1))
        
        return -1
