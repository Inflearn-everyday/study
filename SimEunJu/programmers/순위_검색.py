from itertools import combinations

def solution(infos, queries):
    store = {}
    for info in infos:
        data = info.split(" ")
        conditions = data[:-1]
        score = int(data[-1])
        for i in range(5):
            combiList = list(combinations(range(4), i))
            for combi in combiList:
                _conditions = conditions.copy()
                for idx in combi:
                    _conditions[idx] = "-"
                newConditions = "".join(_conditions)
                if newConditions in store:
                    store[newConditions].append(score)
                else:
                    store[newConditions] = [score]
    
    for scores in store.values():
        scores.sort()
    
    ans = []
    for query in queries:
        conditions = [condition for condition in query.split(" ") if condition != "and"]
        filters = "".join(conditions[:-1])
        score = int(conditions[-1])
        
        if filters in store:
            scores = store[filters]
            if len(scores) > 0:
                start, end = 0, len(scores)
            while start != end and start != len(scores):
                if scores[(start+end) // 2] >= score:
                    end = (start+end) // 2
                else:
                    start = (start+end) // 2 + 1
            ans.append(len(scores) - start)
        else:
            ans.append(0)
        
    return ans
        
