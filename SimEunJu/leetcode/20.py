class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for char in s:
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            else:
                if len(stack) == 0:
                    return False
                
                latest = stack.pop()
                
                if char == ')' and latest != '(':
                    return False
                elif char == '}' and latest != '{':
                    return False
                elif char == ']' and latest != '[':
                    return False
        
        if len(stack) != 0:
            return False
        
        return True
