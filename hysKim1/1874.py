import sys

n = int(sys.stdin.readline())
li = []
stack = []
result = []
index = 0
for i in range(n):
    li.append(int(sys.stdin.readline()))

for i in range(1, n + 1):
    stack.append(i)
    result.append('+')
    while len(stack) > 0 and index < n and stack[-1] == li[index]:
        index += 1
        stack.pop(-1)
        result.append('-')

if len(stack) == 0:
    for op in result:
        print(op)
else:
    print('NO')