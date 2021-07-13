line = input().split()
m = int(line[0])
n = int(line[1])
eratos = [True] * (n + 1)
for i in range(2, n + 1):
    if eratos[i]:
        for j in range(i + i, n + 1, i):
            eratos[j] = False
if m < 2 : m = 2
for j in range(m, n + 1):
    if eratos[j]:
        print(j)
    
