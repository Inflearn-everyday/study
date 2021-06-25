# study of words

ascii_list = []
i = 65
while i < 123:
    if i> 90 and i<97:
        pass
    else:
        ascii_list.append(i)
    i += 1
    
result_list = [0]*26         
word = input()

for i in str(word):
    index = ascii_list.index(ord(i))
    result_list[index%26] += 1

max_val = max(result_list)
index   = result_list.index(max_val)
result_list.sort()
if result_list[-2] != result_list[-1]:
    print(chr(ascii_list[index]))
else:
    print("?")
    
    
# number of words
a = input().split()
print(len(a))


# max number using reverse
a,b = input().split()

a = int(a[::-1])
b = int(b[::-1])

print(max([a,b]))


# dial
alpha = input()
time  = 0
for i in str(alpha):
    o = ord(i)
    if o < 83:
        b = (o - 65)//3
    else: 
        b = (o - 66)//3
    
    if b == 8:
        b = 7
    time += b + 3      # ABC : 3, DEF : 4, etc.
print(time)

# croatia 
text  = input()
croa2 = ['c=','c-','d-','lj','nj','s=','z=']
croa3 = ['dz=']
count = 0

# https://stackoverflow.com/questions/4664850/how-to-find-all-occurrences-of-a-substring
def find_all(a_str, text):
    start = 0
    while True:
        start = a_str.find(text, start)
        if start == -1: return
        yield start
        start += len(text) 
        
for temp in croa2:    
    count += len(list(find_all(text,temp)))
for temp in croa3:
    count += len(list(find_all(text,temp)))
print(len(text) - count)

# group word checker
N     = int(input())
count = 0

def find_all(a_str, text):
    start = 0
    while True:
        start = a_str.find(text, start)
        if start == -1: return
        yield start
        start += len(text) 
        
def group_check(word):
    a_list = []
    result = 1
    for a in word:
        A = list(find_all(word,a))
        if len(A) != 1:
            for i in range(len(A)-1):
                diff = A[i+1] - A[i] 
                if diff>1:
                    result = 0
    return result
    
for i in range(N):
    word   = input()
    count += group_check(word)
        
print(count)
