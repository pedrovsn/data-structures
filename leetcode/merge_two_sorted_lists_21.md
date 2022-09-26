## 21. Merge Two Sorted Lists

### Description

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

### Solution

```
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	aux := &ListNode{0, nil}
	tail := aux
	for {
		if list1 == nil {
			tail.Next = list2
			break
		}

		if list2 == nil {
			tail.Next = list1
			break
		}

		if list1.Val <= list2.Val {
			tail.Next = list1
			list1 = list1.Next
		} else {
			tail.Next = list2
			list2 = list2.Next
		}

		tail = tail.Next
	}

	return aux.Next
}

```