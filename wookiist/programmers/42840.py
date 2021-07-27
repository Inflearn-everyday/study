# 42840 모의고사
S1 = [1, 2, 3, 4, 5]
S2 = [2, 1, 2, 3, 2, 4, 2, 5]
S3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
N1, N2, N3 = [1,0], [2,0], [3,0]

def solution(answers):
    answer = []
    for idx, ans in enumerate(answers):
        if S1[idx%5] == ans:
            N1[1] += 1
        if S2[idx%8] == ans:
            N2[1] += 1
        if S3[idx%10] == ans:
            N3[1] += 1
    Ns = [N1, N2, N3]
    max_score = max(Ns, key=lambda x: x[1])[1]
    for n in Ns:
        if n[1] == max_score:
            answer.append(n[0])
    return answer