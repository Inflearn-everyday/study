t = int(input())

for i in range(0, t):
    words = input().split()
    for word in words:
        print(word[::-1], end = ' ')
    print()
