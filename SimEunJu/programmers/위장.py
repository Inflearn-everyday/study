import collections

def solution(clothes):
    dict = collections.defaultdict(list)
    for cloth in clothes:
        dict[cloth[1]].append(cloth[0])
    
    res = 1
    for cate in dict:
        res *= (len(dict[cate]) + 1)
    
    return res - 1
    
