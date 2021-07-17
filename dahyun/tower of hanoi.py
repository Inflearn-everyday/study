K          = int(input())  # number of disk

# history of initial/final position of a disk on the top
from_pos_l = []            
to_pos_l   = []            

def hanoi(n,from_pos, to_pos, aux_pos):
    if n == 1:
        from_pos_l.append(from_pos)
        to_pos_l.append(to_pos)
        return
    
    # 1. move (n-1)disks from from_pos to aux_pos
    hanoi(n-1, from_pos, aux_pos, to_pos)
    # 2. move the biggest disk from_pos to to_pos
    from_pos_l.append(from_pos)
    to_pos_l.append(to_pos)
    # 3. move (n-1)disks from aux_pos to to_pos
    hanoi(n-1, aux_pos, to_pos, from_pos)

hanoi(K,1,3,2)
a = len(from_pos_l)
print(a)  # number of moving
for i in range(a):
    print(from_pos_l[i], to_pos_l[i]) # print the moving history
