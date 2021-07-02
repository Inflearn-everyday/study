#1712	손익분기점
A, B, C = map(int, input().split())

def bep(A,B,C):
    if B >= C:
        return -1
    return A//(C-B)+1
print(bep(A,B,C))
#print(b<c and a//(c-b)+1or-1)