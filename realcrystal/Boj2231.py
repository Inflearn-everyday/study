n = int(input())
sum = 0
for i in range (1, n):
    sum = i
    now = i
    while i != 0:
        m = int(i%10)
        i= int(i/10)
        sum += m
    if sum == n:
        print(now)
        exit()
print(0)
