end = 1;
path = 1;
n = int(input())
while n > end :
    end += path * 6
    path += 1
print(path)
