# prime number 

# my solution (1716ms)
import math

N = int(input())

if N == 1:
    pass
else:
    n = 2 
    while N > 1 : 
        if N%n != 0:
            n += 1
        else:
            x = 0
            while N%n == 0:
                N = N//n
                x += 1
            for _ in range(x):
                print(n)
# ghtjs5283(68ms)                
def isPrime(n):
    if n<2:
        return False
    i = 2
    while i*i<=n:
        if n%i == 0:
            return False
        i += 1
    return True
def primeList(n):
    i = 2
    l=[]
    while i*i<=n:
        if isPrime(i):
            l.append(i)
        i += 1
    return l
def part(n,i,l):
    if n==1:
        return
    if i>= len(l):
        print(n)
        return
    i_ = l[i]
    if n%i_==0:
        print(i_)
        part(n//i_,i,l)
    else:
        part(n,i+1,l)
n = int(input())
lst = primeList(n)
part(n,0,lst)

# 1929, prime number
def isPrime(n):
    if n<2:
        return False
    i = 2
    while i*i<=n:
        if n%i == 0:
            return False
        i += 1
    return True

def primeList(m,n):
    i = m
    l = []
    while i<=n:
        if isPrime(i):
            print(i)
        i += 1
    return l

m,n = map(int, input().split())
lst = primeList(m,n)
