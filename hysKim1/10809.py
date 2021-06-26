#10809	알파벳 찾기
word=input()
alph_list=[-1]*26
for i in word:
    alph_list[ord(i)-ord('a')]=word.find(i)

for alphabet in alph_list:
    print(alphabet,end=' ')