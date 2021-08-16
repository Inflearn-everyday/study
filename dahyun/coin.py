n, k = map(int, input().split())
coin_list = []
for _ in range(n):
    x = int(input())
    if x <= k:
        coin_list.append(x)
        
count = 0 
for i in range(len(coin_list)): 
    value = coin_list[(len(coin_list))-i-1] 
    count += (k // value) 
    k = k%value 
    
print(count)
