def solution(s):
    lens = []
    for length in range(1, int(len(s)/2)+2):
        i = 0
        prev = s[i:length]
        abbrCnt = 1
        abbrLen = 0
        while i < len(s):
            i += length
            abbr = s[i:i+length]
            if prev == abbr:
                abbrCnt += 1
                continue
            else: 
                abbrLen += length + (len(str(abbrCnt)) if abbrCnt >= 2 else 0)
                abbrCnt = 1
                prev = abbr
        abbrLen -= (length - len(s) % length) if len(s) % length != 0 else 0 
        lens.append(abbrLen)
    
    print(lens)
    return min(lens)
