import collections

def solution(record):
    dict = collections.defaultdict(list)
    
    for r in record:
        arr = r.split(" ")
        if arr[0] != "Leave":
            dict[arr[1]].append(arr[2])
    
    result = []
    for r in record:
        arr = r.split(" ")
        name = dict[arr[1]][-1]
        
        if arr[0] == "Enter":
            result.append(name+"님이 들어왔습니다.")
        elif arr[0] == "Leave":
            result.append(name+"님이 나갔습니다.")
    
    return result
