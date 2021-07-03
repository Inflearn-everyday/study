import sys; input = sys.stdin.readline
def bs(start, end, target, arr):
    if start > end:
        return -1
    mid = int((start+end)/2)
    if target < arr[mid]:
        return bs(start, mid-1, target, arr)
    elif target > arr[mid]:
        return bs(mid+1, end, target, arr)
    return mid
N = int(input())
A = [int(x) for x in input().split()]
A.sort()
M = int(input())
B = [int(x) for x in input().split()]
for b in B:
    if bs(0, N-1, b, A) == -1:
        print(0)
    else:
        print(1)
