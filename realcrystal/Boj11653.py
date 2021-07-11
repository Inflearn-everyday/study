n = int(input())
i = 2
while i <= n:
    if n % i == 0:
        print(i)
        n /= i
    else:
        i += 1
