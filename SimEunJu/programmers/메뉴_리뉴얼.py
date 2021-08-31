from itertools import combinations
from collections import Counter

def solution(orders, course):
    ans = []
    for length in course:
        partials = []
        for order in orders:
            for partial in combinations(order, length):
                sortedPartial = ''.join(sorted(partial))
                partials.append(sortedPartial)
        common = Counter(partials).most_common()
        ans += [menu for menu, cnt in common if cnt > 1 and cnt == common[0][1]]
            
    return sorted(ans)
    
