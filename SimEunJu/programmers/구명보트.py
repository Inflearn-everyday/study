def solution(people, limit):
    people.sort()
    front = 0
    end = len(people) - 1
    cnt = 0

    while front <= end:
        add = 0
        while front <= end and add + people[end] <= limit:
            add += people[end]
            end -= 1
        while front <= end and add + people[front] <= limit:
            add += people[front]
            front += 1
        
        cnt += 1
        
    return cnt
