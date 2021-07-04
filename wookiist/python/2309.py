import sys; input = sys.stdin.readline
A = [0 for _ in range(9)]
sumN = 0 
for i in range(9):
    A[i] = int(input())
    sumN += A[i]
A.sort()
ok = False
for i in range(9):
    for j in range(i, 9):
        if sumN - A[i] - A[j] == 100:
            for k in range(9):
                if k == i or k == j:
                    continue
                print(A[k])
            ok = True
    if ok:
        break