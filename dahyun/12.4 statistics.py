 N = int(input())
x_list = []

for _ in range(N):
    x_list.append(int(input()))
    
# average
ave = round(sum(x_list)/N)
print(ave)

# median
x_list.sort()
print(x_list[N//2])

# mode
num = []
for i in range(N):
    num.append(x_list.count(x_list[i]))

if num.count(max(num)) > 1:
    a = num.index(max(num)) 
    i = num[a+1:].index(max(num[a+1:])) + a + 1
    print(x_list[i])
else:
    a = num.index(max(num)) 
    print(x_list[a])
    
# min max
print(max(x_list) - min(x_list))
