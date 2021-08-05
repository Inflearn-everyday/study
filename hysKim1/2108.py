from collections import Counter
import sys

li = []
for _ in range(int(input())):
    li.append(int(sys.stdin.readline()))
li.sort()
ave = round(sum(li)/len(li)) # 산술평균
if len(li) % 2 == 1:
    median = li[len(li)//2]
else:
    median = round((li[len(li)//2-1] + li[len(li)//2])/2) # 중앙값
cnt = Counter(li)
cnt_sort = cnt.most_common()
max_cnt = cnt_sort[0][1]
max_cnt_li = []
for c in cnt_sort:
    if c[1] == max_cnt:
        max_cnt_li.append(c[0])
if len(max_cnt_li) > 1:
    mode = max_cnt_li[1] 
else:
    mode = max_cnt_li[0] # 최빈값
li_range = max(li)-min(li) # 범위
print(ave)
print(median)
print(mode)
print(li_range)