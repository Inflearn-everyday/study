import math
testCases = int(input())
for i in range(0, testCases):
    tc = input().split()
    dist = int(tc[1]) - int(tc[0])
    
    max = int(math.sqrt(dist))
    
    if max == math.sqrt(dist):
        print(max * 2 - 1)
    elif dist <= max * max + max:
        print(max * 2)
    else:
        print(max * 2 + 1)
