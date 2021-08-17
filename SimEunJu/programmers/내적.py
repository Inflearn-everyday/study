def solution(a, b):
    add = 0
    for i in range(len(a)):
        add += a[i]*b[i]
    return add
