import collections


def solution(n, costs):
    
    costs.sort(key=lambda edge: edge[2])
    
    graph = collections.defaultdict(list)
    for v1, v2, cost in costs:
        graph[v1].append((v2, cost))
        graph[v2].append((v1, cost))
    
    parent = [i for i in range(n)]
    rank = [i for i in range(n)]
    
    def make_set(vertice):
        parent[vertice] = vertice
        rank[vertice] = 0

    #해당 vertice의 최상위 정점을 찾는다
    def find(vertice):
        if parent[vertice] != vertice:
            parent[vertice] = find(parent[vertice])
        return parent[vertice]

    #두 정점을 연결한다
    def union(vertice1, vertice2):
        root1 = find(vertice1)
        root2 = find(vertice2)
        if root1 != root2:
            if rank[root1] > rank[root2]:
                parent[root2] = root1
            else:
                parent[root1] = root2
                if rank[root1] == rank[root2]: 
                    rank[root2] += 1

    
    res = 0
    for v1, v2, cost in costs:
        if find(v1) != find(v2):
            union(v1, v2)
            res += cost
    
    return res
