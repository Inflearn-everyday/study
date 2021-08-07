t = int(input())
cnt = 0
while cnt < t:
    k = int(input())
    n = int(input())
    ppl = [i for i in range(1, n+1)] #0층
    
    for i in range(k):
        for j in range(1, n):
            ppl[j] += ppl[j-1]
    
    print(ppl[-1])
    cnt += 1
