# Collections

A **Collection** represents a group of objects known as its objects.
All general purpose Collection implementation classes provide two standard constructors.
A void constructor, which creates an empty collection.
A constructor with a single parameter of type Collection, which creates a new collection with the same elements as its arguments.

The **Collection** interface contains methods that perform basic operations such as:
* int size();
* boolean isEmpty();
* boolean contains(Object element); 
* boolean add(E element);
* boolean remove(Object element);
* Iterator<E> iterator();

Also, **Collection** interface provides bulk operations such as:
* boolean containsAll(Collection<?> c);
* boolean addAll(Collection<? extends E> c);
* boolean removeAll(Collection<?> c);
* boolean retainAll(Collection<?> c);
* void clear();
* Object[] toArray();
* \<T\> T[] toArray(T[] a);

In JDK 8 and later, the Collection interface exposes the methods Stream<E> stream() and Stream<E> parallelStream(), for obtaining sequential or parallel streams from the collection.

There are 3 ways of traversing collections: 
* Aggregate operations;
* For-each construct:
```
for (Object o : collection) {
    System.out.println(o.toString());
}
```
* Iterators: 
An **Iterator** is an object that enables to traverse through a collection.
Such an object is returned by the **iterator** method of a collection.
```
public interface Iterator<E> {
    boolean hasNext(); // Returns true if the iteration has more elements;
    E next();          // Returns the next element in the iteration;
    void remove();     // Removes the last element accessed via next();
}
```