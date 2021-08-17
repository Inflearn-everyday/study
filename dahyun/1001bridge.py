k = int(input())

def factorial(n):
  if n <= 1:
    return 1
  else:
    result = 1
    for i in range(2, n+1):
      result *= i
    return result

for i in range(k):
    m,n = map(int, input().split())
    result = factorial(n)//(factorial(n-m)*factorial(m))
    print(result)
