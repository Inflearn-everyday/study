# ascii code

a = input()
print(ord(a))

# sum

N = int(input())
num = int(input())
sum = 0

for i in str(num):
    sum += int(i)
print(sum)


# Finding an alphabet
word        = input()
N_list      = []
ascii_list  = list(range(97,123)) # 97 to 122
result_list = [-1]*26
count       = 0

for i in word:
    N_list.append(i)

l = len(N_list) - 1
N_list.reverse()
for i in N_list:
    j = ascii_list.index(ord(i))
    result_list[j] = l
    l -= 1
    
for i in range(26):
    print(result_list[i], end=' ')    
    
    
# repeatitive string
T      = int(input())

for _ in range(T):
    N_list = []
    R,S = input().split() 
    R   = int(R)
    
    for i in str(S):
        N_list.append(i*R)
    for i in range(len(N_list)-1):
        print(N_list[i],end='')
    print(N_list[-1],end='\n')
