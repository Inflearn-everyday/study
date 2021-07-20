N = int(input())
word_list = set() # 중복 제거

for i in range(N):
    word = input()
    word_list.add((word, len(word)))

# 길이가 짧은 것부터
word_list = list(word_list)
word_list.sort(key = lambda x : (x[1], x[0]))

for i in range(len(word_list)):
    print(word_list[i][0])
