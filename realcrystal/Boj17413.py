line = input()
output = []
n = 0
isTag = False
word = []
while n < len(line):
    if line[n] == '<':
        if word:
            output = output + word[::-1]
            word = []
        output.append('<')
        isTag = True
    elif line[n] == '>':
        output.append('>')
        isTag = False
    else:
        if isTag:
            output.append(line[n])
        else:
            if line[n] == ' ' or n == len(line) - 1:
                if n == len(line) - 1:
                    word.append(line[n])
                output = output + word[::-1]
                word = []
                if line[n] == ' ':
                    output.append(' ')
            else:
                word.append(line[n])
    n += 1
print(''.join(output))
