import sys

class Stack():
    def __init__(self):
        self.li = []
    
    def push(self, n):
        self.li.append(n)
        
    def pop(self):
        print(self.li.pop() if len(self.li) > 0 else -1)
    
    def size(self):
        print(len(self.li))
        
    def empty(self):
        print(1 if len(self.li) == 0 else 0)
        
    def top(self):
        print(self.li[-1] if len(self.li) > 0 else -1)
    
stack = Stack()
for _ in range(int(sys.stdin.readline())):
    s = sys.stdin.readline().split()
    if s[0] == "push":
        stack.push(int(s[1]))
    elif s[0] == "pop":
        stack.pop()
    elif s[0] == "size":
        stack.size()
    elif s[0] == "empty":
        stack.empty()
    elif s[0] == "top":
        stack.top()