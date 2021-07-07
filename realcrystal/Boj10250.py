t = int(input())
for i in range(0, t):
    temp = input().split()
    h = int(temp[0])
    w = int(temp[1])
    n = int(temp[2])
    x = int((n - 1) / h) + 1
    y = (n - 1) % h + 1
    print('{0}{1:0>2}'.format(y, x))
