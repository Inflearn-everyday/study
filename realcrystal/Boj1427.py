n = int(input())
numbers = []
while n > 0:
    numbers.append(n%10)
    n = int(n/10)
numbers.sort(reverse=True)
print(*numbers, sep='')
