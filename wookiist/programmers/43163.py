# 43163 깊이/너비 우선 탐색(DFS/BFS) > 단어 변환

from collections import deque
from string import ascii_lowercase

alpha_list = list(ascii_lowercase)

def solution(begin, target, words):
    D = dict()
    D[begin] = 0
    if target not in words:
        return 0
    q = deque([begin])
    while q:
        nx = q.popleft()
        if nx == target:
            break
        for idx, spell in enumerate(list(nx)):
            temp_word_list = list(nx)
            for alpha in alpha_list:
                if spell == alpha:
                    continue
                temp_word_list[idx] = alpha
                temp_word = ''.join(temp_word_list)
                if temp_word in words and D.get(temp_word) is None:
                    D[temp_word] = D[nx]+1
                    q.append(temp_word)
    return D[target]