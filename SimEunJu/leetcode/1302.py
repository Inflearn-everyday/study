# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    result = 0
    depth = 0
    def deepestLeavesSum(self, root: TreeNode) -> int:
        
        def findDepth(node, depth):
            if not node:
                return depth-1
            
            right = findDepth(node.right, depth+1)
            left = findDepth(node.left, depth+1)
            
            return max(right, left)
        
        def findLeafDfs(node, depth):
            if not node.right and not node.left and depth == self.depth:
                self.result += node.val
                return
            
            if node.right:
                findLeafDfs(node.right, depth+1)
            if node.left:
                findLeafDfs(node.left, depth+1)
            
        self.depth = findDepth(root, 0)
        
        findLeafDfs(root, 0)
        
        return self.result
