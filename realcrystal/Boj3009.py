dots = [{'x':0, 'y':0}, {'x':0, 'y':0}, {'x':0, 'y':0}]
x = 0
y = 0
for dot in dots:
    line = input().split()
    dot['x'] = int(line[0])
    dot['y'] = int(line[1])

if dots[1]['x'] == dots[2]['x']:
    x = dots[0]['x']
elif dots[0]['x'] == dots[2]['x']:
    x = dots[1]['x']
else:
    x = dots[2]['x']
    
if dots[1]['y'] == dots[2]['y']:
    y = dots[0]['y']
elif dots[0]['y'] == dots[2]['y']:
    y = dots[1]['y']
else:
    y = dots[2]['y']
print(x, y)
