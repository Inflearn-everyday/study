testcase = input().split()
x = int(testcase[0])
y = int(testcase[1])
w = int(testcase[2])
h = int(testcase[3])

xdiff = w - x
ydiff = h - y
print(min(x, y, xdiff, ydiff))
