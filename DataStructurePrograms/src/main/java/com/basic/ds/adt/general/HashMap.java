package com.basic.ds.adt.general;

/**
 * The Class HashMap.
 * 
 * @author rameasy@gmail.com
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public class HashMap<K, V> {

	/** The default initial capacity. */
	private static int DEFAULT_INITIAL_CAPACITY = 16;

	/** The capacity. */
	private int capacity;

	/** The table. */
	private Entry<K, V>[] table;

	/**
	 * Instantiates a new hash map.
	 */
	public HashMap() {
		this(DEFAULT_INITIAL_CAPACITY);
	}

	/**
	 * Instantiates a new hash map.
	 *
	 * @param capacity the capacity
	 */
	public HashMap(int capacity) {
		this.capacity = capacity;
		table = new Entry[capacity];
	}

	/**
	 * This method inserts the data into the HashMap.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public void put(K key, V value) {
		int index = getIndex(key);
		Entry<K, V> entry = new Entry<>(key, value, null);
		if (table[index] == null) {
			table[index] = entry;
		} else {
			Entry<K, V> previousNode = null;
			Entry<K, V> currentNode = table[index];
			while (currentNode != null) {
				if (currentNode.getKey().equals(key)) {
					currentNode.setValue(value);
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			if (previousNode != null)
				previousNode.setNext(entry);
		}
	}

	/**
	 * This method retrieves the data from the HashMap.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V get(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}

	/**
	 * This method deletes/removes the data from the HashMap.
	 *
	 * @param key the key
	 */
	public void remove(K key) {
		int index = getIndex(key);
		Entry<K, V> previous = null;
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.getKey().equals(key)) {
				if (previous == null) {
					entry = entry.getNext();
					table[index] = entry;
					break;
				} else {
					previous.setNext(entry.getNext());
					break;
				}
			}
			previous = entry;
			entry = entry.getNext();
		}
	}

	/**
	 * This method prints the data availble in the HashMap.
	 */
	public void print() {
		if (table != null) {
			for (var i = 0; i < table.length; i++) {
				Entry<K, V> entry = table[i];
				if (entry != null) {
					if (entry.getNext() == null) {
						System.out.print("Key :: " + entry.getKey() + " Value::" + entry.getValue());
					} else {
						while (entry.getNext() != null) {
							System.out.print("Key :: " + entry.getKey() + " Value::" + entry.getValue());
							entry = entry.getNext();
						}
					}
					System.out.println();
				}
			}
		}

	}

	/**
	 * This method returns the index value of the key passed.
	 *
	 * @param key the key
	 * @return the index
	 */
	private int getIndex(K key) {
		if (key == null) {
			return 0;
		}
		return Math.abs(key.hashCode() % capacity);
	}

}
