# collectionframework
Collection Framework- Collection it is a group of objects

3 interfaces-
1. List- It allows duplication of data. It follows insertion order
A] ArrayList- DDL[Read]
B] LinkedList- DML[Insert/Update/Delete]

2. Set- It is a uniqueness
A] HashSet- It does not maintain order
          - It allows one null element
B] TreeSet- It follows order
          - It does not allow any null element

3. Map- K, V pair. Key must be unique and value allows duplicate
A] HashMap- It does not maintain order
          - It allows one null key and allows multiple null values
B] TreeMap- It follows order
          - It does not allow any null key but it allows multiple null values
		  
IQ-
1. Diff ArrayList vs LinkedList
2. When ConcurrentModificationException comes?
3. Explain Fail Fast vs Fail Safe iterator in Java
   - 2 classes in Java those are Fail Safe Iterator
     1. CopyOnWriteArrayList
	 2. ConcurrentHashMap
	 
4. What is LinkedHashSet
   - It is non-synchronized
   - It follows insertion order

5. What is LinkedHashMap
   - It is non-synchronized
   - It follows insertion order
   
6. What is ConcurrentHashMap
   - It is a fail safe iterator class in Java
   - It is used in MultiThreading environment to achieve Thread Safety
   - It does not allow any null key, value
   - It comes in JDK 1.5

7. How HashMap internally works?
	1 Bucket- 16 block
	2 method equals(), hashcode()

8. Diff List vs Vector

9. Diff HashMap vs Hashtable

10. Diff Comparable vs Comparator

11. Employee List- id, name, salary
    filter data salary>=50000
	sort data by salary
	sort by name
	fetch second largest salary record

12. Convert List into Map

