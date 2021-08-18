from sys import stdin

n = int(input())
deque = []

for command in stdin:
    words = command.split()
    if words[0] == 'push_front':
        deque.insert(0, int(words[1]))
    elif words[0] == 'push_back':
        deque.append(int(words[1]))
    elif words[0] == 'pop_front':
        if len(deque) == 0:
            print(-1)
        else:
            print(deque.pop(0))
    elif words[0] == 'pop_back':
        if len(deque) == 0:
            print(-1)
        else:
            print(deque.pop())
    elif words[0] == 'size':
        print(len(deque))
    elif words[0] == 'empty':
        if len(deque) == 0:
            print(1)
        else:
            print(0)
    elif words[0] == 'front':
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[0])
    elif words[0] == 'back':
        if len(deque) == 0:
            print(-1)
        else:
            print(deque[-1])
