package com.basic.ds.adt.list;

/**
 * This class implements the linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
public class LinkedList<T> {
	/**
	 * Points to the node in the linked list.
	 */
	LinkedListNode<T> node;

	/**
	 * This method inserts data at the temp node of the linked list.
	 * 
	 * @param data
	 */
	public void insert(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<>(data);
		newNode.next = null;
		if (this.node == null) {
			this.node = newNode;
			return;
		} else {
			LinkedListNode<T> tempNode = this.node;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}

	/**
	 * This method removes data based on the data passed in the linked list.
	 * 
	 * @param data
	 */
	public void removeData(T data) {
		LinkedListNode<T> tempNode = this.node;
		LinkedListNode<T> prevNode = null;
		if (tempNode != null && tempNode.data == data) {
			node = tempNode.next;
			return;
		}
		while (tempNode != null && !data.equals(tempNode.data)) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		if (tempNode == null)
			return;
		prevNode.next = tempNode.next;
	}

	/**
	 * This method removes data based on the position passed in the linked list.
	 * 
	 * @param position
	 */
	public void removePosition(int position) {
		LinkedListNode<T> tempNode = this.node;
		LinkedListNode<T> prevNode = null;
		int count = 0;
		if (tempNode != null && count == position) {
			node = tempNode.next;
			return;
		}
		while (tempNode != null && position != count) {
			count++;
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		if (tempNode == null)
			return;
		prevNode.next = tempNode.next;
	}

	/**
	 * This method prints the data available in the linked list.
	 */
	public void printList() {
		LinkedListNode<T> tempNode = this.node;
		while (tempNode.next != null) {
			System.out.print(tempNode.data + " --> ");
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data + " --> null");
	}

	/**
	 * This method returns the size of the linked list.
	 */
	public int size() {
		int count = 0;
		LinkedListNode<T> tempNode = this.node;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			count++;
		}
		count++;
		return count;
	}

	/**
	 * This method sorts the linked list in ascending order.
	 */
	@SuppressWarnings("unchecked")
	public void sort() {
		LinkedListNode<Integer> currentNode = (LinkedListNode<Integer>) this.node;
		while (currentNode != null) {
			LinkedListNode<Integer> nextNode = currentNode.next;
			while (nextNode != null) {
				if (currentNode.data > nextNode.data) {
					Integer temp = currentNode.data;
					currentNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			currentNode = currentNode.next;
		}
	}

	/**
	 * This method prints the data in linked list reversely.
	 */
	public void printReverse(LinkedListNode<Integer> llNode) {
		if (llNode.next != null) {
			printReverse(llNode.next);
		}
		if (llNode.next == null) {
			System.out.print("Null<--" + llNode.data);
		} else {
			System.out.print("<--" + llNode.data);
		}
	}

	/**
	 * This method removes duplicate node from the list.
	 */
	public void removeDuplicates(LinkedListNode<Integer> llist) {
		LinkedListNode<Integer> out = new LinkedListNode<>(-1);
		LinkedListNode<Integer> t = out;

		while (llist != null) {
			while (llist.next != null && llist.data == llist.next.data) {
				llist = llist.next;
			}
			t.next = new LinkedListNode(llist.data);
			t = t.next;
			llist = llist.next;
		}
		this.node = (LinkedListNode<T>) out.next;
		printList();
	}

	/**
	 * This method checks whether it is cyclic linkedlist.
	 */
	public boolean checkIfCyclic(LinkedListNode<Integer> llist) {
		if (llist == null || llist.next == null) {
			return false;
		}
		LinkedListNode<Integer> head = llist;
		LinkedListNode<Integer> tail = head.next;
		while (head != tail) {
			if (tail == null || tail.next == null) {
				return false;
			}
			head = head.next;
			tail = tail.next.next;
		}
		return true;
	}

	/**
	 * This method reverse a linkedlist.
	 */
	public LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	/**
	 * This method add the numbers in two linkedlists.
	 */
	public LinkedListNode<Integer> addTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
		LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
		LinkedListNode<Integer> head1 = list1;
		LinkedListNode<Integer> head2 = list2;
		LinkedListNode<Integer> resultList = dummy;
		int carry = 0;
		while (head1 != null || head2 != null) {
			int sum = (head1 != null ? head1.data : 0) + (head2 != null ? head2.data : 0) + carry;
			carry = sum / 10;
			resultList.next = new LinkedListNode(sum % 10);
			if(head1 != null) {
				head1 = head1.next;
			}
			if(head2 != null) {
				head2 = head2.next;
			}
			resultList = resultList.next;
		}
		if(carry > 0 ) {
			resultList.next = new LinkedListNode(carry);	
		}
		return dummy.next;
	}
}

/**
 * This class is the node class for linked list.
 * 
 * @author rameasy@gmail.com
 *
 * @param <T>
 */
class LinkedListNode<T> {
	/**
	 * Refers the next node available in the list.
	 */
	LinkedListNode<T> next;
	/**
	 * Data stored in the node.
	 */
	T data;

	/**
	 * The constructor.
	 * 
	 * @param data
	 */
	public LinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}