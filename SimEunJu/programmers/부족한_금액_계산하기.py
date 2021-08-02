def solution(price, money, count):
    diff = price*(count*(count+1)/2) - money
    if diff < 0:
        return 0
    return diff
