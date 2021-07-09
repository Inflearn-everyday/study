x, y, w, h = map(int, input().split())
left   = x 
right  = w - x
top    = y
bottom = h - y

print(min([left,right,top,bottom]))
