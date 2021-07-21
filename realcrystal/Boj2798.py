line = input().split()
n = int(line[0])
m = int(line[1])
cards = []
line = input().split()
for i in range (0, n):
    cards.append(int(line[i]))
result = 0
sum = 0
for i in range (0, n - 2):
    for j in range (i + 1, n - 1):
        for k in range (j + 1, n):
            sum = cards[i] + cards[j] + cards[k]
            if sum <= m and sum > result:
                result = sum
print(result)
