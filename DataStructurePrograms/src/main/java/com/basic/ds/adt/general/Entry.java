package com.basic.ds.adt.general;

/**
 * The Class Entry.
 *
 * @author rameasy@gmail.com
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public class Entry<K, V> {

	/** The key. */
	private K key;

	/** The value. */
	private V value;

	/** The next. */
	private Entry<K, V> next;

	/**
	 * Instantiates a new entry.
	 *
	 * @param key   the key
	 * @param value the value
	 * @param next  the next
	 */
	Entry(K key, V value, Entry<K, V> next) {
		this.next = next;
		this.key = key;
		this.value = value;
	}

	/**
	 * Sets the key.
	 *
	 * @param key the new key
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public K getKey() {
		return this.key;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public Entry<K, V> getNext() {
		return this.next;
	}

	/**
	 * Sets the next.
	 *
	 * @param next the next
	 */
	public void setNext(Entry<K, V> next) {
		this.next = next;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(V value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public V getValue() {
		return this.value;
	}

}
