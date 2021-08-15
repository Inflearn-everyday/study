# programmers 위클리 챌린지 2주차
def solution(scores):
    answer = ''
    i_len = len(scores)
    temp_arr = [0 for _ in range(i_len)]
    for i in range(i_len):
        for j in range(i_len):
            temp_arr[j] = scores[j][i]
        max_val = max(temp_arr)
        min_val = min(temp_arr)
        max_self, min_self = False, False
        if max_val == temp_arr[i]:
            max_self = True
        if min_val == temp_arr[i]:
            min_self = True
        selfOK = False
        selfScore = 0
        if not max_self and not min_self:
            selfOK = True
        for j in range(i_len):
            if max_self and i != j and max_val == temp_arr[j]:
                selfOK = True
            if min_self and i != j and min_val == temp_arr[j]:
                selfOK = True
        selfScore = sum(temp_arr)
        if not selfOK:
            selfScore -= temp_arr[i]
            selfScore /= (i_len-1)
        else:
            selfScore /= i_len
        answer += classify(selfScore)
    return answer

def classify(score):
    if score >= 90:
        return 'A'
    elif 80 <= score < 90:
        return 'B'
    elif 70 <= score < 80:
        return 'C'
    elif 50 <= score < 70:
        return 'D'
    else:
        return 'F'

print(solution([[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]]))