class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = collections.defaultdict(list);
        
        for word in strs:
            ordered = ''.join(sorted(word))
            dict[ordered].append(word)
            
        return dict.values()
