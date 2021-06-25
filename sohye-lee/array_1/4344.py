ct = int(input())

for i in range(ct):
    scores = input().split(" ")
    students = int(scores[0])
    scores = list(map(int,scores[1:]))
    stu_top = 0
    average = sum(scores)/students
    for s in scores:
        if s > average:
            stu_top += 1
    result = (stu_top/students)*100
    print(format(result, '.3f')+"%")
