def solution(scores):
    res = ""
    for row in range(len(scores)):
        score = [s[row] for s in scores];
        sortedScore = sorted(score);
        
        if sortedScore[0] != sortedScore[1] and sortedScore[0] == score[row]:
            sortedScore.pop(0)
        
        last = len(sortedScore) - 1
        if sortedScore[last] != sortedScore[last-1] and sortedScore[last] == score[row]:
            sortedScore.pop()
        
        avg = sum(sortedScore) / len(sortedScore)
        
        if avg >= 90:
            res += "A"
        elif avg >= 80:
            res += "B"
        elif avg >= 70:
            res += "C"
        elif avg >= 50:
            res += "D"
        else:
            res += "F"
        
    return res
        
