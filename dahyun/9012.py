T = int(input())
for i in range(T):
    s = list(input())
    sum = 0
    for i in s:
        if i == '(':
            sum += 1
        elif i == ')':
            sum -= 1
        
    if sum == 0:
        print('YES')
    else:
        print('NO')
