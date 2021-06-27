# A+B

A,B = map(int, input().split())
print(A+B)

# sugar delivery
sugar = int(input())

bag = 0
while sugar>=0:
    if sugar%5==0:
        bag += sugar//5
        print(bag)
        break
    sugar -= 3
    bag += 1
    
else:
    print(-1)
    # https://ooyoung.tistory.com/81

    
# the president of woman society
T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
      
    low_level = [k+1 for k in range(n)]  
    for i in range(k):
        current_level = [1]*n
        for j in range(1,n):
            current_level[j] = current_level[j-1] + low_level[j]
        low_level = current_level
    print(current_level[-1])
