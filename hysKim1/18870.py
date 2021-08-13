N = int(input())
li = list(map(int,input().split()))
sorted_li = sorted(set(li))
d = {sorted_li[i]: i for i in range(len(sorted_li))}
res = [d[n] for n in li]
print(*res)