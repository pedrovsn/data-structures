## 35. Search Insert Position

### Description

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

### Solution

```
func listSize(head *ListNode) int {
	next := head
	total := 0
	for {
		total = total + 1
		if next.Next == nil {
			break
		}
		next = next.Next
	}

	return total
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func middleNode(head *ListNode) *ListNode {
	total := listSize(head)
	middle := head
	for i := 0; i < total/2; i++ {
		middle = middle.Next
	}

	return middle
}
```