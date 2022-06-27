package com.basic.ds.adt.list;

/**
 * This class implements the Sorted Linked list(Linked list with sorted data).
 * 
 * @author rameasy@gmail.com
 *
 * @param <Integer>
 */
public class SortedLinkedList {
	/**
	 * Points to the node in the linked list.
	 */
	LinkedListNode<Integer> node;

	/**
	 * This method inserts data at the temp node of the linked list.
	 * 
	 * @param data
	 */
	public void insert(Integer data) {
		LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
		newNode.next = null;
		if (this.node == null) {
			this.node = newNode;
			return;
		} else {
			LinkedListNode<Integer> tempNode = this.node;
			if (data < tempNode.data) {
				newNode.next = tempNode;
				node = newNode;
			} else {
				while (tempNode.data < data && tempNode.next != null && tempNode.next.data < data) {
					tempNode = tempNode.next;
				}
				System.out.println("Current node = " + tempNode.data);
				if (tempNode.next != null) {
					newNode.next = tempNode.next;
					tempNode.next = newNode;
				}
				if (tempNode.next == null) {
					tempNode.next = newNode;
				}
			}
		}
	}

	/**
	 * This method prints the data available in the sorted linked list.
	 */
	public void printList() {
		LinkedListNode<Integer> tempNode = this.node;
		while (tempNode.next != null) {
			System.out.print(tempNode.data + " --> ");
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data + " --> null");
	}

	/**
	 * This method returns the size of the sorted linked list.
	 */
	public int size() {
		int count = 0;
		LinkedListNode<Integer> tempNode = this.node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			count++;
		}
		count++;
		return count;
	}

	/**
	 * This method merge the two sorted linked list.
	 */
	public LinkedListNode<Integer> merge(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
		LinkedListNode<Integer> dummyNode = new LinkedListNode<>(0);
		LinkedListNode<Integer> currNode = dummyNode;
		while (list1 != null || list2 != null) {
			int temp = 0;
			if (list1 != null && list2 != null) {
				if (list1.data < list2.data) {
					temp = list1.data;
					list1 = list1.next;
				} else {
					temp = list2.data;
					list2 = list2.next;
				}
			} else if (list1 != null) {
				temp = list1.data;
				list1 = list1.next;
			} else {
				temp = list2.data;
				list2 = list2.next;
			}
			currNode.next = new LinkedListNode<>(temp);
			currNode = currNode.next;
		}
		return dummyNode.next;
	}

	/**
	 * This method merge the two sorted linked list in recursion.
	 */
	public LinkedListNode<Integer> mergeTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		if (list1.data < list2.data) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}

		else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}

	}
}
