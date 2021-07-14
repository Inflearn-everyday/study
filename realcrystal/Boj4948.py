eratos = [True] * (123456 * 2 + 1)
for i in range (0, len(eratos)):
    if i == 0:
        eratos[i] == False
        continue
    if i == 1:
        continue
    if eratos[i]:
        for j in range (i + i, len(eratos), i):
            eratos[j] = False
            
n = int(input())
while n != 0:
    cnt = 0
    for i in range(n + 1, n * 2 + 1):
        if eratos[i]:
            cnt += 1
    print(cnt)
    n = int(input())
