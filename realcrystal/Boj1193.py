x = int(input())

line = 1
x -= line
while x > 0:
    line += 1
    x -= line
cnt = x + line
son = 0
if line % 2 == 0:
    son = 0
    for i in range(0, cnt):
        son += 1
        
else:
    son = line + 1
    for i in range(0, cnt):
        son -= 1
mom = line - son + 1

print(son, "/", mom, sep="")
