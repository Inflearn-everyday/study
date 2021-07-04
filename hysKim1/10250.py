#10250	ACM 호텔
for _ in range(int(input())):
    h,w,num = map(int,input().split(" "))
    x=1
    y=0
    while num > h:
        x=x+1
        num = num-h
    y = num
    if x<10:
        print(str(y)+"0"+str(x))
    else:
        print(str(y)+str(x))