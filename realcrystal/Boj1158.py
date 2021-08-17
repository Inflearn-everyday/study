n, k = input().split()
n = int(n)
k = int(k)

myList = list(range(1, n + 1))
josephusList = list()
idx = 0
while len(myList) > 0:
    idx = idx + k - 1
    if idx >= len(myList):
        idx = idx % len(myList)
    value = myList[idx]
    josephusList.append(value)
    myList.remove(value)
print('<', ", ".join(map(str, josephusList)), '>', sep='')
