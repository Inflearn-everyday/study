# Bertrand's postulate
import math

def prime_list(N):
    if N == 1:
        return 1
    elif N> 1 and N<4:
        return 2
    else:
        l = 0
        i_list = list(range(3,int(math.sqrt(2*N)+1), 2)) + [2]
        for num in range(N, 2*N + 1):
            if all(num%i != 0 for i in i_list):
                l += 1
        return l
                   
while True:
    a = int(input())
    if a == 0:
        break
    else:
        print(prime_list(a))
