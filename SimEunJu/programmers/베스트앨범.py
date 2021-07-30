import collections

def solution(genres, plays):
    
    dict = collections.defaultdict(list)
    for i in range(0, len(genres)):
        dict[genres[i]].append((i, plays[i]))
    
    for key, value in dict.items():
        value.sort(key=lambda el: (-el[1], el[0]))
    
    
    ordered = sorted(dict.keys(), key=lambda key: sum( [play[1] for play in dict[key]] ), reverse=True)
    
    res = []
    for genre in ordered:
        res += [play[0] for play in dict[genre]][0:2]
        
    return res
