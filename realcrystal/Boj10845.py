from sys import stdin
n = int(input())
myQueue = []

for i in range(0, n):
    command = stdin.readline().rsplit()
    if command[0] == 'push':
        myQueue.append(command[1])
    elif command[0] == 'pop':
        if len(myQueue) == 0:
            print(-1)
        else:
            print(myQueue[0])
            myQueue = myQueue[1:]
    elif command[0] == 'size':
        print(len(myQueue))
    elif command[0] == 'empty':
        if len(myQueue) == 0:
            print(1)
        else:
            print(0)
    elif command[0] == 'front':
        if len(myQueue) == 0:
            print(-1)
        else:
            print(myQueue[0])
    elif command[0] == 'back':
        if len(myQueue) == 0:
            print(-1)
        else:
            print(myQueue[-1])
    
