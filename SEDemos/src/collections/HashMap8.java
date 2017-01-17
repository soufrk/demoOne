package collections;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

public class HashMap8<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap8<>();
		//HashMap<Integer, String> myMap = new HashMap<>();
		//HashMap8<Integer, String> myMap = new HashMap8<>();
		myMap.put(1, "AAA");
		//myMap.put(2, "BBB");
		/*myMap.put(3, "CCC");
		myMap.put(4, "DDD");
		myMap.put(5, "EEE");
		myMap.put(6, "FFF");
		myMap.put(7, "GGG");
		myMap.put(8, "HHH");
		myMap.put(9, "III");
		myMap.put(10, "JJJ");*/
	//	myMap.put(11, "KKK");
		//System.out.println(myMap);
		/*myMap.put(12, "LLL");
		myMap.put(13, "MMM");
		myMap.put(14, "NNN");
		myMap.put(15, "OOO");
		myMap.put(16, "PPP");*/
		myMap.put(17, "QQQ");
	//	System.out.println(myMap);
		/*myMap.put(18, "RRR");
		myMap.put(19, "SSS");
		myMap.put(20, "TTT");
		myMap.put(1, "UUU");*/

		System.out.println(myMap);

	}

	static class Node<K, V> implements Map.Entry<K, V> {
		final int hash;
		final K key;
		V value;
		Node<K, V> next;

		Node(int hash, K key, V value, Node<K, V> next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		public final String toString() {
			return key + "=" + value;
		}

		public final int hashCode() {
			return Objects.hashCode(key) ^ Objects.hashCode(value);
		}

		public final V setValue(V newValue) {
			V oldValue = value;
			value = newValue;
			return oldValue;
		}

		public final boolean equals(Object o) {
			if (o == this)
				return true;
			if (o instanceof Map.Entry) {
				Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
				if (Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue()))
					return true;
			}
			return false;
		}
	}

	static final int MAXIMUM_CAPACITY = 1 << 30;
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
	static final int TREEIFY_THRESHOLD = 8;

	transient Set<Map.Entry<K, V>> entrySet;
	transient Node<K, V>[] table;
	transient int modCount;
	transient int size;
	int threshold;
	final float loadFactor;

	public HashMap8(int initialCapacity, float loadFactor) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
		if (initialCapacity > MAXIMUM_CAPACITY)
			initialCapacity = MAXIMUM_CAPACITY;
		if (loadFactor <= 0 || Float.isNaN(loadFactor))
			throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
		this.loadFactor = loadFactor;
		this.threshold = tableSizeFor(initialCapacity);
	}

	public HashMap8(int initialCapacity) {
		this(initialCapacity, DEFAULT_LOAD_FACTOR);
	}

	public HashMap8() {
		this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
	}

	public V put(K key, V value) {
		return putVal(hash(key), key, value, false, true);
	}

	final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
		Node<K, V>[] tab;
		Node<K, V> p;
		int n, i;
		if ((tab = table) == null || (n = tab.length) == 0)
			n = (tab = resize()).length;
		if ((p = tab[i = (n - 1) & hash]) == null)
			tab[i] = newNode(hash, key, value, null);
		else {
			Node<K, V> e;
			K k;
			if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
				e = p;
			/*
			 * else if (p instanceof TreeNode) e = ((TreeNode<K, V>)
			 * p).putTreeVal(this, tab, hash, key, value);
			 */
			else {
				for (int binCount = 0;; ++binCount) {
					if ((e = p.next) == null) {
						p.next = newNode(hash, key, value, null);
						if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
							// treeifyBin(tab, hash);
							break;
					}
					if (e.hash == hash &&
							((k = e.key) == key 
							|| (key != null 
							&& key.equals(k))))
						break;
					p = e;
				}
			}
			if (e != null) { // existing mapping for key
				V oldValue = e.value;
				if (!onlyIfAbsent || oldValue == null)
					e.value = value;
				afterNodeAccess(e);
				return oldValue;
			}
		}
		++modCount;
		if (++size > threshold)
			resize();
		afterNodeInsertion(evict);
		return null;
	}

	final Node<K, V>[] resize() {
		Node<K, V>[] oldTab = table;
		int oldCap = (oldTab == null) ? 0 : oldTab.length;
		int oldThr = threshold;
		int newCap, newThr = 0;
		if (oldCap > 0) {
			if (oldCap >= MAXIMUM_CAPACITY) {
				threshold = Integer.MAX_VALUE;
				return oldTab;
			} else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY && oldCap >= DEFAULT_INITIAL_CAPACITY)
				newThr = oldThr << 1; // double threshold
		} else if (oldThr > 0) // initial capacity was placed in threshold
			newCap = oldThr;
		else { // zero initial threshold signifies using defaults
			newCap = DEFAULT_INITIAL_CAPACITY;
			newThr = (int) (DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
		}
		if (newThr == 0) {
			float ft = (float) newCap * loadFactor;
			newThr = (newCap < MAXIMUM_CAPACITY && ft < (float) MAXIMUM_CAPACITY ? (int) ft : Integer.MAX_VALUE);
		}
		threshold = newThr;
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Node<K, V>[] newTab = (Node<K, V>[]) new Node[newCap];
		table = newTab;
		if (oldTab != null) {
			for (int j = 0; j < oldCap; ++j) {
				Node<K, V> e;
				if ((e = oldTab[j]) != null) {
					oldTab[j] = null;
					if (e.next == null)
						newTab[e.hash & (newCap - 1)] = e;
					/*
					 * else if (e instanceof TreeNode)
					 * ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
					 */
					else { // preserve order
						Node<K, V> loHead = null, loTail = null;
						Node<K, V> hiHead = null, hiTail = null;
						Node<K, V> next;
						do {
							next = e.next;
							if ((e.hash & oldCap) == 0) {
								if (loTail == null)
									loHead = e;
								else
									loTail.next = e;
								loTail = e;
							} else {
								if (hiTail == null)
									hiHead = e;
								else
									hiTail.next = e;
								hiTail = e;
							}
						} while ((e = next) != null);
						if (loTail != null) {
							loTail.next = null;
							newTab[j] = loHead;
						}
						if (hiTail != null) {
							hiTail.next = null;
							newTab[j + oldCap] = hiHead;
						}
					}
				}
			}
		}
		return newTab;
	}

	void afterNodeAccess(Node<K, V> p) {
	}

	void afterNodeInsertion(boolean evict) {
	}

	void afterNodeRemoval(Node<K, V> p) {
	}

	Node<K, V> newNode(int hash, K key, V value, Node<K, V> next) {
		return new Node<>(hash, key, value, next);
	}

	static final int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> es;
		return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
	}

	final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
		public final int size() {
			return size;
		}

		public final void clear() {
			HashMap8.this.clear();
		}

		public final Iterator<Map.Entry<K, V>> iterator() {
			return new EntryIterator();
		}

		public final boolean contains(Object o) {
			if (!(o instanceof Map.Entry))
				return false;
			Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
			Object key = e.getKey();
			Node<K, V> candidate = getNode(hash(key), key);
			return candidate != null && candidate.equals(e);
		}

		public final boolean remove(Object o) {
			if (o instanceof Map.Entry) {
				Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
				Object key = e.getKey();
				Object value = e.getValue();
				return removeNode(hash(key), key, value, true, true) != null;
			}
			return false;
		}

		/*
		 * public final Spliterator<Map.Entry<K, V>> spliterator() { return new
		 * EntrySpliterator<>(HashMap8.this, 0, -1, 0, 0); }
		 */

		public final void forEach(Consumer<? super Map.Entry<K, V>> action) {
			Node<K, V>[] tab;
			if (action == null)
				throw new NullPointerException();
			if (size > 0 && (tab = table) != null) {
				int mc = modCount;
				for (int i = 0; i < tab.length; ++i) {
					for (Node<K, V> e = tab[i]; e != null; e = e.next)
						action.accept(e);
				}
				if (modCount != mc)
					throw new ConcurrentModificationException();
			}
		}
	}

	final Node<K, V> getNode(int hash, Object key) {
		Node<K, V>[] tab;
		Node<K, V> first, e;
		int n;
		K k;
		if ((tab = table) != null && (n = tab.length) > 0 && (first = tab[(n - 1) & hash]) != null) {
			if (first.hash == hash && // always check first node
					((k = first.key) == key || (key != null && key.equals(k))))
				return first;
			if ((e = first.next) != null) {
				/*
				 * if (first instanceof TreeNode) return
				 * ((TreeNode<K,V>)first).getTreeNode(hash, key);
				 */
				do {
					if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k))))
						return e;
				} while ((e = e.next) != null);
			}
		}
		return null;
	}

	abstract class HashIterator {
		Node<K, V> next; // next entry to return
		Node<K, V> current; // current entry
		int expectedModCount; // for fast-fail
		int index; // current slot

		HashIterator() {
			expectedModCount = modCount;
			Node<K, V>[] t = table;
			current = next = null;
			index = 0;
			if (t != null && size > 0) { // advance to first entry
				do {
				} while (index < t.length && (next = t[index++]) == null);
			}
		}

		public final boolean hasNext() {
			return next != null;
		}

		final Node<K, V> nextNode() {
			Node<K, V>[] t;
			Node<K, V> e = next;
			if (modCount != expectedModCount)
				throw new ConcurrentModificationException();
			if (e == null)
				throw new NoSuchElementException();
			if ((next = (current = e).next) == null && (t = table) != null) {
				do {
				} while (index < t.length && (next = t[index++]) == null);
			}
			return e;
		}

		public final void remove() {
			Node<K, V> p = current;
			if (p == null)
				throw new IllegalStateException();
			if (modCount != expectedModCount)
				throw new ConcurrentModificationException();
			current = null;
			K key = p.key;
			removeNode(hash(key), key, null, false, false);
			expectedModCount = modCount;
		}
	}

	final Node<K, V> removeNode(int hash, Object key, Object value, boolean matchValue, boolean movable) {
		Node<K, V>[] tab;
		Node<K, V> p;
		int n, index;
		if ((tab = table) != null && (n = tab.length) > 0 && (p = tab[index = (n - 1) & hash]) != null) {
			Node<K, V> node = null, e;
			K k;
			V v;
			if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
				node = p;
			else if ((e = p.next) != null) {
				/*
				 * if (p instanceof TreeNode) node = ((TreeNode<K, V>)
				 * p).getTreeNode(hash, key); else {
				 */
				do {
					if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k)))) {
						node = e;
						break;
					}
					p = e;
				} while ((e = e.next) != null);
				// }
			}
			if (node != null && (!matchValue || (v = node.value) == value || (value != null && value.equals(v)))) {
				/*
				 * if (node instanceof TreeNode) ((TreeNode<K, V>)
				 * node).removeTreeNode(this, tab, movable); else
				 */ if (node == p)
					tab[index] = node.next;
				else
					p.next = node.next;
				++modCount;
				--size;
				afterNodeRemoval(node);
				return node;
			}
		}
		return null;
	}

	final class KeyIterator extends HashIterator implements Iterator<K> {
		public final K next() {
			return nextNode().key;
		}
	}

	final class ValueIterator extends HashIterator implements Iterator<V> {
		public final V next() {
			return nextNode().value;
		}
	}

	final class EntryIterator extends HashIterator implements Iterator<Map.Entry<K, V>> {
		public final Map.Entry<K, V> next() {
			return nextNode();
		}
	}

	@Override
	public String toString() {
		String result = "";
		int index = 0;
		for (Node temp : table) {
			Node start = temp;
			if (start != null) {
				result += "table[" + index++ + "] - ";
				while (start != null) {
					result += start.getKey() + "->" + start.getValue() + ", ";
					start = start.next;
				}
			}
			result += "\n";
		}
		return result;
	}

}
