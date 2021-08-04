
N = int(input())
li = [0]*10000
for _ in range(N):
    li[int(input())-1] += 1
for i in range(10000):
    for j in range(li[i]):
        print(i+1)