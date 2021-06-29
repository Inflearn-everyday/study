# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        up = 0
        result = root = ListNode()
        
        while l1 or l2 or up:
            added = 0
            if l1:
                added += l1.val
                l1 = l1.next
            if l2:
                added += l2.val
                l2 = l2.next
            
            added += up
            if added > 9:
                added -= 10
                up = 1
            else:
                up = 0
            
            result.next = ListNode(added)
            result = result.next
            
        return root.next
            
