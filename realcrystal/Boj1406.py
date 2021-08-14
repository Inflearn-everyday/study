from sys import stdin
 
left = list(stdin.readline().strip())
right = []
n = int(input())

for command in stdin:
    if command[0] == 'P':
        left.append(command[2])
    elif command[0] == 'L': #커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
        if left:
            right.append(left.pop())
    elif command[0] == 'D': #커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
        if right:
            left.append(right.pop())
    else: #B
        if left:
            left.pop()
print(''.join(left + right[::-1]))
