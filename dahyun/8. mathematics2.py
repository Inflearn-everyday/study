# snail wants to go up
import math
A,B,V = map(int, input().split())

day = (V-A)/(A-B) + 1
print(math.ceil(day))

# ACM Hotel
T = int(input())
for _ in range(T):
    H,W,N = map(int, input().split())
    
    H_room = N%H 
    W_room = N//H
    if H_room == 0:
        print(H,end='')
        if W_room < 10:
            print(f'0{W_room}')
        else:
            print(W_room)
    else:
        print(f'{H_room}',end='')
        W_room += 1
        if W_room < 10:
            print(f'0{W_room}')
        else:
            print(W_room)
