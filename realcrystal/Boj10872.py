n = int(input())
def fact(n):
    if n == 0:
        return 1
    return fact(n - 1) * n
print(fact(n))
