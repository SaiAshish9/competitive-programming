## HashMap Vs TreeMap

```
HashMap allows a single null key and multiple null values. TreeMap does not allow null keys but can have multiple null values. HashMap allows heterogeneous elements because it does not perform sorting on keys. TreeMap allows homogeneous values as a key because of sorting.
```

## HashSet Vs TreeSet

```
1
Implementation 
Hash set is implemented using HashTable 
The tree set is implemented using a tree structure. 
2
Null Object 
HashSet allows a null object 
The tree set does not allow the null object. It throws the null pointer exception. 
3
Methods 
Hash set use equals method to compare two objects 
Tree set use compare method for comparing two objects. 
4
Heterogeneous object 
Hash set doesn't now allow a heterogeneous object 
Tree set allows a heterogeneous object 
5
Ordering 
HashSet does not maintain any order 
TreeSet maintains an object in sorted order 
```

## Difference between ArrayList and LinkedList

```
Interface List<E>
Being an interface means it cannot be instantiated (no new List() is possible)


```
 List<String> supplierNames1 = new ArrayList<String>();
 List<String> supplierNames2 = new LinkedList<String>();
 List<String> supplierNames3 = new Vector<String>();
 List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
```
ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.

However, there are many differences between ArrayList and LinkedList classes that are given below.

ArrayList	LinkedList
1) ArrayList internally uses a dynamic array to store the elements.	LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
```