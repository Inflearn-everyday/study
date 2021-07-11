# 42748 정렬 > K번째수

def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        s_array = sorted(array[commands[i][0]-1:commands[i][1]])
        answer.append(s_array[commands[i][2]-1])
    return answer