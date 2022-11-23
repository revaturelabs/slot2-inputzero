
### Collection Framework 

-> java.util package
-> Collection Framework = Collection Interface (List, Set, Queue) + Map Interface

### Map Interface

- Map Interface doesn't extend Collection interface/Iterable interface but its a part of collection framework

### Things common for collection frame work

- all are objects(Arraylist, linkedlist, hash set, hashmap classes)
- can allows us to store hetrogenous(differen,-> string, number, object in a same list)
- size not fixed (you don't worry size)
- .size() method -> print the size/length


### Collection Interface vs Map Interface

- Collection Interface extends iterable interface wheras Map not
- All the classes implements the collection interface stores data but Map stores as key value pair


### List Vs Set

- List allows dulpicates whereas set not (set doesn't allow duplicates)
-> You can acess elements inside your list using indexes. But indexes not there set
- list follows insertion order whereas hashset doesn't  follow any order,
     (treeset follows ascending order, linkedhashset follows insertion order)


### Set and Map comparsion

- unique values (data)

- HashSet -> doesn't  follow any order
- LinkedHashSet -> follows insertion order
- TreeSet-> ascending order

- unique keys (key)
     - Hashmap -> doesn't  follow any order (ONE NULL KEY ALLOWED)
     - LinkedHashmap-> follows insertion order (ONE NULL KEY ALLOWED)
     - TreeMap -> ascending order (NULL KEY IS NOT ALLOWED)

### Hash Map

key
 - unique keys
 - one null is allowed

WHAT HAPPENS IF WE PUT/ADD THE SAME KEY INTO A MAP

When you are trying to put the same again like

```
hm.put(1, "One")
hm.put(1, "ONE")
```
your key 1 is updated with latest value i.e "ONE"

### ArrayList vs LinkedList  (both are indexed)

list -> 1, 2, 3, 4, 5

- ArrayList interally an array stored continously in a memory
- LinkedList interally store as a node (doubly linked list)

Insert an element in btween 

- in an arraylist al.add(2, 33)
	-if there already an element in index 2
		- its shift all the elements back by postion then adds 33
- in an linkedlist ll.add(2,33)
	- creates a node 33
	- change links (there is no shifting is happening)

Since there is no shifting is happening in the linkedlist, linkedlist is considered faster than the arraylist when it comes to inserting/deleting an element in between

for remaining other operations, we can go for arraylist.