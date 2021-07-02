class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # 사이클이 있는지
        
        graph = collections.defaultdict(list)
        
        for before, after in prerequisites:
            graph[before].append(after)
            
        visited = set()
        end = set()
        
        def findCircleDfs(course):
            if course in visited:
                return False
            if course in end:
                return True
            
            visited.add(course)
            
            for c in graph[course]:
                if not findCircleDfs(c):
                    return False
            
            visited.remove(course)
            end.add(course)
            
            return True
    
        for key in list(graph):
            if not findCircleDfs(key):
                return False
            
        return True
