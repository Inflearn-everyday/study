def solution(word):
    seq = {'E': 1, 'I': 2, 'O': 3, 'U': 4}
    res = 0
    for i in range(len(word)):
        char = word[i]
        if char == 'A':
            res += 1
            continue
        for j in range(4, i, -1):
            res += (5 ** (j-i)) * seq[word[i]]
        res += seq[word[i]] + 1
    
    return res
