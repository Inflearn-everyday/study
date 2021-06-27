class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        def find(start, end):
            while start >= 0 and end < len(s) and s[start] == s[end]:
                start -= 1
                end += 1
            return s[start+1:end]
        
        result = ""
        for i in range(0, len(s)):
            result = max(result, find(i, i), find(i, i+1), key = len)
            
        return result
            
