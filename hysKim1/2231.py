def func(N):
    for i in range(1, N):
        s = i
        for l in str(i):
            s += int(l)
        if s == N:
            return i
    return 0

print(func(int(input())))