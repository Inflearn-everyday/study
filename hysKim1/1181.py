li = []
for _ in range(int(input())):
    word = input()
    if word not in li:
        li.ㄴappend(word)
li.sort()
li.sort(key=lambda x : len(x))
for word in li:
    print(word)