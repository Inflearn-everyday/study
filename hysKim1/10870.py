# 피보나치 수 5
n = int(input())
a, b = 0, 1
for i in range(n):
    a, b = b, a+b
print(a)