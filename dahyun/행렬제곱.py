# https://claude-u.tistory.com/421

def matrix_mul(a, b):
    result = [[0]* N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            for k in range(N):
                result[i][j] += a[i][k] * b[k][j]
    
    for i in range(N):
        for j in range(N):
            result[i][j] %= 1000
                
    return result
    
    
N, B = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]
B = bin(B)[2:] #2진법으로 변환

identity_matrix = [[1 if i == j else 0 for i in range(N)] for j in range(N)]

result = identity_matrix[:]
for i in range(len(B)):
    if B[-i-1] == '1':
        temp = matrix[:]
        while i != 0:
            temp = matrix_mul(temp, temp)
            i -= 1
        result = matrix_mul(result, temp)

for row in result:
    print(*row)
