for _ in range(int(input())):
    a = input()
    while '()' in a:
        a = a.replace('()', '')
    if len(a) > 0:
        print('NO')
    else:
        print('YES')