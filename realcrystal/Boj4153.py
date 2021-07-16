def pytha(a, b, c):
    if a * a + b * b == c * c:
        print('right')
    else:
        print('wrong')

line = input().split()
x = int(line[0])
y = int(line[1])
z = int(line[2])
while not (x == 0 and y == 0 and z == 0):
    max_value = max(x, y, z)
    
    if max_value == x:
        pytha(y, z, x)
    elif max_value == y:
        pytha(x, z, y)
    else:
        pytha(x, y, z)
    line = input().split()
    x = int(line[0])
    y = int(line[1])
    z = int(line[2])
