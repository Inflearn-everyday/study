# prime number
import math

M = int(input())
N = int(input())
prime = []
if M == 1 and N == 2:
    print(-1)
elif M == 1:
    for num in range(2,N+1):
        if all(num%i!=0 for i in range(2,int(math.sqrt(num))+1)):
            prime.append(num)
    if len(prime) == 0:
        print(-1)
    else:
        print(sum(prime))
        print(prime[0])
else:

    for num in range(M,N+1):
        if all(num%i!=0 for i in range(2,int(math.sqrt(num))+1)):
            prime.append(num)

    if len(prime) == 0:
        print(-1)
    else:
        print(sum(prime))
        print(prime[0])
