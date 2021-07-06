import math

T = int(input())
for _ in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())

    if x1 == x2 and y1 == y2 and r1 == r2:
        print(-1)
    else: 
        distance = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)
        r  = [r1, r2]
        r.sort() 
        r1 = r[0] # r1 < r2
        r2 = r[1]
        if distance == r2 - r1 or distance == r1 + r2 :   # 내접(inscription) or 외접(circumcircle)
            print(1)
        elif distance < r1 + r2 and distance >  r2 - r1: 
            print(2)
        else:
            print(0)
