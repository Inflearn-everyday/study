import math

N = int(input())
M = math.factorial(N)
count = 0

while True:
    if M < 1 or N == 0:
        print(count)
        break
    a = M%10
    
    if a == 0:
        count += 1
        M = M//10
    else:
        print(count)
        break
