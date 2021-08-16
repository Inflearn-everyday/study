'''
1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)

X X X 8 인 경우 : 1,000개 ( X X X 는 세자리이므로 0 0 0 ~ 9 9 9 까지 1000개)
X X 8 X 인 경우 : 1,000개 ( X X X 는 세자리이므로 0 0 0 ~ 9 9 9 까지 1000개)
X 8 X X 인 경우 : 1,000개 ( X X X 는 세자리이므로 0 0 0 ~ 9 9 9 까지 1000개)
8 X X X 인 경우 ; 1,000개 ( X X X 는 세자리이므로 0 0 0 ~ 9 9 9 까지 1000개)
총 4000개
'''
print(str(list(range(1,10001))).count('8'))

cnt=0
for i in range(10):
    for j in range(10):
        for k in range(10):
            for l in range(10):
                if l == 8:
                    cnt=cnt+1
                if k == 8:
                    cnt=cnt+1
                if j == 8:
                    cnt=cnt+1
                if i == 8:
                    cnt=cnt+1
print(cnt)
