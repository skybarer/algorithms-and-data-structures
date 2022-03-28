## Linked List

- [x] Basic operations on List

```java
  public interface List<E> extends java.util.Collection<E> {
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean contains(java.lang.Object);
    public abstract java.util.Iterator<E> iterator();
    public abstract java.lang.Object[] toArray();
    public abstract <T> T[] toArray(T[]);
    public abstract boolean add(E);
    public abstract boolean remove(java.lang.Object);
    public abstract boolean containsAll(java.util.Collection<?>);
    public abstract boolean addAll(java.util.Collection<? extends E>);
    public abstract boolean addAll(int, java.util.Collection<? extends E>);
    public abstract boolean removeAll(java.util.Collection<?>);
    public abstract boolean retainAll(java.util.Collection<?>);
    public void replaceAll(java.util.function.UnaryOperator<E>);
    public void sort(java.util.Comparator<? super E>);
    public abstract void clear();
    public abstract boolean equals(java.lang.Object);
    public abstract int hashCode();
    public abstract E get(int);
    public abstract E set(int, E);
    public abstract void add(int, E);
    public abstract E remove(int);
    public abstract int indexOf(java.lang.Object);
    public abstract int lastIndexOf(java.lang.Object);
    public abstract java.util.ListIterator<E> listIterator();
    public abstract java.util.ListIterator<E> listIterator(int);
    public abstract java.util.List<E> subList(int, int);
    public java.util.Spliterator<E> spliterator();
  }
```
