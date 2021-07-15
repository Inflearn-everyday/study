# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def mergeTrees(self, root1: TreeNode, root2: TreeNode) -> TreeNode:
        def merge(node1, node2):
            if node1 and node2:
          
                node = TreeNode(node1.val + node2.val)
                node.left = merge(node1.left, node2.left)
                node.right = merge(node1.right, node2.right)
                return node
            elif node1:
                return node1
            elif node2:
                return node2
        
        return merge(root1, root2)
                
