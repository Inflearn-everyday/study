#1011 Fly me to the Alpha Centauri

for _ in range(int(input())):
    s, f = map(int, input().split(' '))
    n = f - s
    a = 1
    while pow(a, 2) + a < n:
        a += 1

    if n <= pow(a , 2):
        result = a * 2 - 1
    else:
        result = a * 2
    print(result)