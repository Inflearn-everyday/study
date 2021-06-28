# Fly me to the alpha centauri 

# My solution (976ms)
T   = int(input())
for _ in range(T):
    x,y = map(int, input().split())

    diff  = y - x
    count = 0
    num   = 1
    while True:
        if diff <= num:
            count += 1
            print(count)
            break
        elif diff <= 2*num:
            count += 2
            print(count)
            break
        else:
            diff  -= 2*num
            count += 2        
            num   += 1

 # solibaht solution(68ms)
import sys
import math
k = int(input())
for i in range(k):
  A, B = map(int,sys.stdin.readline().split())
  n = B - A
  a = int(math.sqrt(n - 1)) + 1
  if n > a * (a - 1):
    print(2 * a - 1)
  else:
    print(2 * a - 2)
