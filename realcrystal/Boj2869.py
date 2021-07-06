import math

input = input().split()
a = int(input[0])
b = int(input[1])
v = int(input[2]) - a;
day = math.ceil(v / (a - b)) + 1
print(day)
