a,b,c  = map(int, input().split())
while a != 0:
    T_list = [a,b,c]
    T_list.sort()
    diagonal = T_list[-1]
    a = T_list[0]
    b = T_list[1]

    if diagonal**2 - a**2 - b**2 ==0:
        print('right')
    else:
        print('wrong')

    a,b,c  = map(int, input().split())
