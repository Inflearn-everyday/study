letters = ['A', 'E', 'I', 'O', 'U']
cnt = 0
D = {}

def solution(word):
    maker(1, '', word)
    return D[word]-1

def maker(idx :int, word: str, target: str):
    global cnt
    if target in D or idx > 6 or word in D:
        return 
    else:
        cnt += 1
        D[word] = cnt
    for letter in letters:
        maker(idx+1, word+letter, target)