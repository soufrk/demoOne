package collections;

import java.util.NoSuchElementException;

public class LinkedListDemo {
	
    transient int size = 0;

    transient int modCount = 0;
    transient Node first;
    transient Node last;
    
    public LinkedListDemo() {
    }

    /*public LinkedListDemo(Collection<? extends E> c) {
        this();
        addAll(c);
    }*/

    private void linkFirst(String e) {
    	System.out.println("Invoked:linkFirst()");
        final Node f = first;
        final Node newNode = new Node(null, e, f);
        System.out.println("Creatd new node as" + newNode);
        first = newNode;
        System.out.println("Seting this node as first");
        if (f == null){
        	// Applicable for 1st node. Last & First point to newNode
        	last = newNode;
        	System.out.println("First was null, setting this node as last");
        }
        else{
        	System.out.println("First was not null, seting this node as next node of previous First.");
        	f.prev = newNode;
        }
        size++;
        modCount++;
        System.out.println("Mod Count:" + modCount + "\n");
    }

    void linkLast(String e) {
    	System.out.println("Invoked:linkLast()");
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        System.out.println("Creatd new node as" + newNode);
        last = newNode;
        System.out.println("Seting this node as last");
        if (l == null){
        	// Applicable for 1st node. Last & First point to newNode
        	first = newNode;
        	System.out.println("Last was null, setting this node as first.");
        }          
        else{
        	// Set newNode as next of previous Last.
        	System.out.println("Last was not null, seting this node as next node of previous Last.");
        	l.next = newNode;
        }
        size++;
        //System.out.println("Size of list:" + size);
        modCount++;
        System.out.println("Mod Count:" + modCount + "\n");
    }

    /*void linkBefore(E e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }*/

    private String unlinkFirst(Node f) {
    	System.out.println("Invoked:unlinkFirst()");
        // assert f == first && f != null;
        final String element = f.item;
        System.out.println("Extracting content of node to be removed");
        final Node next = f.next;
        System.out.println("Keeping reference of the next-node");
        f.item = null;
        System.out.println("Setting content of the node as null");
        f.next = null; // help GC
        System.out.println("Setting next of the node as null");
        first = next;
        System.out.println("Setting the next-node as first node");
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    /*private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }*/

    /*E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }*/

    public String getFirst() {
        final Node f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    public String getLast() {
        final Node l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    public String removeFirst() {
        final Node f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    /*public E removeLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }*/

    public void addFirst(String e) {
    	System.out.println("Invoked:addFirst()");
        linkFirst(e);
    }

    public void addLast(String e) {
    	System.out.println("Invoked:addLast()");
        linkLast(e);
    }

    /*public boolean contains(Object o) {
        return indexOf(o) != -1;
    }*/
    
    /*public int size() {
        return size;
    }*/

    public boolean add(String e) {
    	System.out.println("Invoked:add()");
        linkLast(e);
        return true;
    }

    /*public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }*/

    /*public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }*/

    /*public boolean addAll(int index, Collection<? extends E> c) {
        checkPositionIndex(index);

        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        Node<E> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked") E e = (E) o;
            Node<E> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }

        size += numNew;
        modCount++;
        return true;
    }*/

    /*public void clear() {
        // Clearing all of the links between nodes is "unnecessary", but:
        // - helps a generational GC if the discarded nodes inhabit
        //   more than one generation
        // - is sure to free memory even if there is a reachable Iterator
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
        modCount++;
    }*/


    // Positional Access Operations

    /*public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }*/

    /*public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }*/

    /*public void add(int index, E element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }*/

    /*public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }*/

    /*private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }*/

    /*private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }*/

    /*private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }*/

    /*Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }*/

    /*public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }*/

    /*public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (o.equals(x.item))
                    return index;
            }
        }
        return -1;
    }*/

    // Queue operations.

    public String peek() {
        final Node f = first;
        return (f == null) ? null : f.item;
    }

    public String element() {
        return getFirst();
    }

    /*public E poll() {
        final Node<E> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }*/
    
    /*public E remove() {
        return removeFirst();
    }*/

    /*public boolean offer(E e) {
        return add(e);
    }*/

    /*public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }*/

    /*public boolean offerLast(E e) {
        addLast(e);
        return true;
    }*/

    /*public E peekFirst() {
        final Node<E> f = first;
        return (f == null) ? null : f.item;
     }*/

    /*public E peekLast() {
        final Node<E> l = last;
        return (l == null) ? null : l.item;
    }*/

    /*public E pollFirst() {
        final Node<E> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }*/

    /*public E pollLast() {
        final Node<E> l = last;
        return (l == null) ? null : unlinkLast(l);
    }*/

    /*public void push(E e) {
        addFirst(e);
    }*/

    /*public E pop() {
        return removeFirst();
    }*/

    /*public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }*/

    /*public boolean removeLastOccurrence(Object o) {
        if (o == null) {
            for (Node<E> x = last; x != null; x = x.prev) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }*/

    
    /*public ListIterator<E> listIterator(int index) {
        checkPositionIndex(index);
        return new ListItr(index);
    }*/

    /*private class ListItr implements ListIterator<E> {
        private Node<E> lastReturned = null;
        private Node<E> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        ListItr(int index) {
            // assert isPositionIndex(index);
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public E next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public E previous() {
            checkForComodification();
            if (!hasPrevious())
                throw new NoSuchElementException();

            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            checkForComodification();
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount++;
        }

        public void set(E e) {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();
            lastReturned.item = e;
        }

        public void add(E e) {
            checkForComodification();
            lastReturned = null;
            if (next == null)
                linkLast(e);
            else
                linkBefore(e, next);
            nextIndex++;
            expectedModCount++;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }*/

    private static class Node {
        String item;
        Node next;
        Node prev;

        Node(Node prev, String element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
            
        }

		@Override
		public String toString() {
			return "Node [item=" + item + ", next=" + next + ", prev=" + prev
					+ "]";
		}
        
        
    }

    /*public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }*/

   /*private class DescendingIterator implements Iterator<E> {
        private final ListItr itr = new ListItr(size());
        public boolean hasNext() {
            return itr.hasPrevious();
        }
        public E next() {
            return itr.previous();
        }
        public void remove() {
            itr.remove();
        }
    }*/

    /*private LinkedList<E> superClone() {
        try {
            return (LinkedList<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }*/

    /*public Object clone() {
        LinkedList<E> clone = superClone();

        // Put clone into "virgin" state
        clone.first = clone.last = null;
        clone.size = 0;
        clone.modCount = 0;

        // Initialize clone with our elements
        for (Node<E> x = first; x != null; x = x.next)
            clone.add(x.item);

        return clone;
    }*/

    
    /*public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }*/

    
    /*public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                                a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (a.length > size)
            a[size] = null;

        return a;
    }*/

    private static final long serialVersionUID = 876323262645176354L;
    
    public static void main(String args[]){
    	LinkedListDemo obj = new LinkedListDemo();
    	obj.add("A");
    	obj.addFirst("B");
    }

    /*private void writeObject(java.io.ObjectOutputStream s)
        throws java.io.IOException {
        // Write out any hidden serialization magic
        s.defaultWriteObject();

        // Write out size
        s.writeInt(size);

        // Write out all elements in the proper order.
        for (Node<E> x = first; x != null; x = x.next)
            s.writeObject(x.item);
    }*/

    /*private void readObject(java.io.ObjectInputStream s)
        throws java.io.IOException, ClassNotFoundException {
        // Read in any hidden serialization magic
        s.defaultReadObject();

        // Read in size
        int size = s.readInt();

        // Read in all elements in the proper order.
        for (int i = 0; i < size; i++)
            linkLast((E)s.readObject());
    }*/
}
