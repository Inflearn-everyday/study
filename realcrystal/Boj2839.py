n = int(input())

modfive = n % 5

if modfive == 0:
    print(int(n / 5))
elif modfive == 1:
    if n - 6 < 0:
        print(-1)
    else:
        print(int((n - 6) / 5) + 2)
elif modfive == 2:
    if n - 12 < 0:
        print(-1)
    else:
        print(int((n - 12) / 5) + 4)
elif modfive == 3:
    print(int(n / 5) + 1)
elif modfive == 4:
    if n - 9 < 0:
        print(-1)
    else:
        print(int((n - 9) / 5) + 3)
