# 회문 순열
def solution(words):
    words = words.replace(' ', '')
    words_dict = {}
    for word in words:
        if word not in words_dict :
            words_dict[word] = 1
        else:
            words_dict[word] += 1
    if len(words) % 2 == 0:
        for value in words_dict.values():
            if value % 2 != 0:
                return False
    else:
        one_value = 0
        for value in words_dict.values():
            if value % 2 != 0:
                one_value += 1
            if one_value > 1:
                return False

    return True