#1978 소수찾기 
n = int(input())
li = list(map(int, input().split()))
t_li = [1]*(max(li)+1)
for i in range(2, max(li)//2 + 1):
    if t_li[i] == 1:
        for j in range(i+i, max(li)+1, i):
            t_li[j] = 0
prime = []
for i in range(2, len(t_li)):
    if t_li[i] == 1:
        prime.append(i)
cnt = 0
for n in li:
    if n in prime:
        cnt += 1
print(cnt)