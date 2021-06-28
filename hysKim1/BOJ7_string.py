#11654	아스키 코드
print(ord(input()))

#11720	숫자의 합
_=int(input())
print(sum(list(map(int, input()))))

#10809	알파벳 찾기
word=input()
alph_list=[-1]*26
for i in word:
    alph_list[ord(i)-ord('a')]=word.find(i)

for alphabet in alph_list:
    print(alphabet,end=' ')

#2675   문자열 반복
for i in range(int(input())):
    n,string= input().split( )
    for j in list(string):
        print(j*int(n), end='')
    print()   
    
#1157	단어 공부
arr=[0]*26
word=input().upper()
for i in word:
    arr[ord(i)-ord('A') ] += 1
if arr.count(max(arr))>1:
    print('?')
else:
    print(chr(arr.index(max(arr))+ord('A')))

arr.index()
#1152	단어의 개수
print(len(input().split()))

#2908	상수
a,b = input().split()
print(int(a[::-1])) if int(a[::-1]) > int(b[::-1]) else print(int(b[::-1]))

#5622   다이얼
dial = ['abc','def','ghi','jkl','mno','pqrs','tuv','wxyz']
input = input().lower()
min_time = 0
for i in range(len(input)):
    for j in dial:
        if input[i] in j:
            min_time += s.index(j)+3
print(min_time)

#2941	크로아티아 알파벳
arr = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
w = input()
 
for c in arr:
    w = w.replace(c, '*')
print(len(w))

#1316	그룹 단어 체커
result = 0
for i in range(int(input())):
    word = input()
    if list(word) == sorted(word, key=word.):
        result += 1
print(result)

result = int(input())
for _ in range(result):
    word = input()
    for i in range(1, len(word)):
        if word.find(word[i-1]) > word.find(word[i]):
            result -= 1
            break
print(result)