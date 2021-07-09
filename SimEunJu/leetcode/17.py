class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        map = { "2": "abc", "3": "def", "4": "ghi", "5": "jkl", "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz" }
        result = []
        
        def searchDfs(digitIdx, letter):
            if len(letter) == len(digits):
                result.append(letter)
                return
            
            digit = digits[digitIdx]
            for i in range(0, len(map[digit])):
                searchDfs(digitIdx+1, letter+map[digit][i])
        
        if digits == "":
            return []
        
        searchDfs(0, "")
        return result
            
