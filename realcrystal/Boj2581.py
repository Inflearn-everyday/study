start_num = int(input())
last_num = int(input())

myList = []
for num in range(start_num, last_num+1):
    error = 0
    if num > 1 :
        for i in range(2, num):
            if num % i == 0:
                error += 1
                break
        if error == 0:
            myList.append(num)
            
if len(myList) > 0 :
    print(sum(myList))
    print(min(myList))
else:
    print(-1)
