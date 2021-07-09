n = int(input())

if n == 0:
    print('0')
elif n == 1:
    print('1')
else:
    fi_list = [0,1]
    for _ in range(n-1):
        a = sum(fi_list)
        fi_list[0] = fi_list[1]
        fi_list[1] = a
        
    print(a)
        
