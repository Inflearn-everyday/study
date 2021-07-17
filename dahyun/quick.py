
N      = int(input())
x = []

if N < 9:
    for _ in range(N):
        x.append(int(input()))
    x.sort()

    for i in range(N):
        print(x[i])
else:
    for _ in range(N):
        x.append(int(input()))
    pl = 0
    pr = N-1
    mid = x[N//2]
    
    while pl <= pr:
        while x[pl] < mid: pl += 1
        while x[pr] > mid: pr -= 1
        if pl <= pr:
            x[pl], x[pr] = x[pr], x[pl]
            pl += 1
            pr -= 1
            
    for i in range(N):
        print(x[i])
