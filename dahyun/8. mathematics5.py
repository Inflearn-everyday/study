# finding a prime number
import math
prime = []
for num in range(2,1001):
    if all(num%i!=0 for i in range(2,int(math.sqrt(num))+1)):
        prime.append(num)

k      = int(input())
N_list = map(int, input().split())
count  = 0
for i in N_list:
    if prime.count(i) >0:
        count += 1
print(count)
