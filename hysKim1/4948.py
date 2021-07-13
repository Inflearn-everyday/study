while True:
    n = int(input())
    if n == 0:
        break
    n1, n2= n+1, 2*n
    li = [1]*(n2+1)
    for i in range(2, int((n2+1)**0.5) + 1):
        if li[i] == 1:
            for j in range(i+i, n2+1, i):
                li[j] = 0
    cnt = 0
    for i in range(n1, n2+1):
        if li[i] == 1 and i > 1:
            cnt += 1
    print(cnt)
