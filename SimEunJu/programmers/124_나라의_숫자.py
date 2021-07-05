def solution(n):
    map = ['4', '1', '2']
    ans = ''
    while n > 0:
        ans = map[n%3] + ans
        n = n // 3 - (n%3 == 0)
    return ans
