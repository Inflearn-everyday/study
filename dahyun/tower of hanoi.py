K          = int(input())
from_pos_l = []
to_pos_l   = []

def hanoi(n,from_pos, to_pos, aux_pos):
    if n == 1:
        from_pos_l.append(from_pos)
        to_pos_l.append(to_pos)
        return
    
    hanoi(n-1, from_pos, aux_pos, to_pos)
    from_pos_l.append(from_pos)
    to_pos_l.append(to_pos)
    hanoi(n-1, aux_pos, to_pos, from_pos)

hanoi(K,1,3,2)
a = len(from_pos_l)
print(a)
for i in range(a):
    print(from_pos_l[i], to_pos_l[i])
