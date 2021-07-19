while True:
    ip = input()
    if ip == '0 0 0':
        break
    li = list(map(int, ip.split()))
    li.sort()
    if li[0]**2 + li[1]**2 == li[2]**2:
        print('right')
    else:
        print('wrong')