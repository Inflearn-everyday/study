# 0831~0901
def prime_list(n):
    sieve = [True]*n
    m = int(n**0.5)
    for i in range(2, m+1):
        if sieve[i] == True:
            for j in range(i+i, n, i):
                sieve[j] = False
    return [i for i in range(2,n) if sieve[i] == True]

def sosu(n):
    li = prime_list(n)
    idx = max([i for i in range(len(li)) if li[i]<= n/2])
    for i in range(idx, -1, 1):
        for j in range(i, len(li)):
            if li[i]+li[j]==n:
                return [li[i], li[j]]
            
for _ in range(int(input())):
    n = int(input())
    print(" ".join(map(str, sosu(n))))
    
    
# runtime error 나서
sosu = [0 for i in range(10001)]
sosu[1] = 1
for i in range(2, 98):
    for j in range(i * 2, 10001, i):
        sosu[j] = 1
t = int(input())
for i in range(t):
    a = int(input())
    b = a // 2
    for j in range(b, 1, -1):
        if sosu[a - j] == 0 and sosu[j] == 0:
            print(j, a - j)
            break
