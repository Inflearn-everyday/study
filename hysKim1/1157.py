#1157	단어 공부
arr=[0]*26
word=input().upper()
for i in word:
    arr[ord(i)-ord('A') ] += 1
if arr.count(max(arr))>1:
    print('?')
else:
    print(chr(arr.index(max(arr))+ord('A')))
