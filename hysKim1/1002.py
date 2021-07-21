for _ in range(int(input())):
    li = list(map(int, input().split()))
    p1 = li[:2]
    r1 = float(li[2])
    p2 = li[3:5]
    r2 = float(li[5])
    r = ((p2[0]-p1[0])**2 + (p2[1]-p1[1])**2)**0.5
    if p1 == p2 and r1 == r2:
        print(-1)
    elif r1+r2 == r or abs(r1-r2) == r:
        print(1)
    elif r1+r2 < r or abs(r1-r2) > r:
        print(0)
    else:
        print(2)