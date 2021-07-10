n = int(input())
numbers = input().split()
result = 0
for i in range(0, n):
    number = int(numbers[i])
    for j in range(2, number + 1):
        if number % j == 0:
            if j == number:
                result += 1
            else:
                break
        
print(result);
