t = int(input())

for i in range(0, t):
    target = input()
    opCnt = 0
    cpCnt = 0
    result = True
    for letter in target:
        if letter == '(':
            opCnt += 1
        else: #letter == ')'
            if opCnt == cpCnt:
                result = False
                break
            cpCnt += 1
    if opCnt != cpCnt:
        result = False
    if result:
        print("YES")
    else:
        print("NO")
    result = True
            
