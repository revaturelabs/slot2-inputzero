
Collection Framework -> java.util package

Collection Interface -> List, Set, Queue
Map Interface

* Map Interface doesn't extend Collection interface/Iterable interface but its a part of collection framework

things common for collection frame work

-> all are objects(Arraylist, linkedlist, hash set, hashmap classes)

-> can allows us to store hetrogenous(differen,-> string, number, object in a same list)

-> size not fixed (you don't worry size)

-> .size() method -> print the size/length


Collection Interface vs Map Interface

-> Collection Interface extends iterable interface wheras Map not

-> All the classes implements the collection interface stores data but Map stores as key value pair


List Vs Set

-> List allows dulpicates whereas set not (set doesn't allow duplicates)

-> You can acess elements inside your list using indexes. But indexes not there set

-> list follows insertion order whereas hashset doesn't  follow any order,
     (treeset follows ascending order, linkedhashset follows insertion order)

```
-> unique values (data)

hashset -> doesn't  follow any order
Linkedhashset -> follows insertion order
treeset-> ascending order

-> unique keys (key)
Hashmap -> doesn't  follow any order (ONE NULL KEY ALLOWED)
LinkedHashmap-> follows insertion order (ONE NULL KEY ALLOWED)
TreeMap -> ascending order (NULL KEY IS NOT ALLOWED)
```

key

- unique keys
- one null is allowed

WHAT HAPPENS IF WE PUT/ADD THE SAME KEY INTO A MAP

When you are trying to put the same again like

hm.put(1, "One")
hm.put(1, "ONE")

your key 1 is updated with latest value i.e "ONE"
