#5622   다이얼
s = ['abc','def','ghi','jkl','mno','pqrs','tuv','wxyz']
input = input().lower()
min_time = 0
for i in range(len(input)):
    for j in s:
        if input[i] in j:
            min_time += s.index(j)+3
print(min_time)