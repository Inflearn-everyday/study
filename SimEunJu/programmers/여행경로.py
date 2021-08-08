import collections

def solution(tickets):
    graph = collections.defaultdict(list)
    
    for f,t in tickets:
        graph[f].append(t)

    res = ["ICN"]
    for g in graph:
        graph[g].sort()
        
    def findDfs(f):
        res.append(f)
        if graph[f]:
            t = graph[f].pop(0)
            findDfs(t)
            graph[f].append(t)
            
    while graph["ICN"]:
        t = graph["ICN"].pop(0)
        findDfs(t)
        if laen(res) == len(tickets) + 1:
            break
        graph["ICN"].append(t)
        res = ["ICN"]
    
    return res
