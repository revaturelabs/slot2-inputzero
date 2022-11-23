### Exceptions

- checked and unchecked exceptions
- custom exceptions
- try, catch, finally, 
- throw, throws

### throws vs throw

- throws always will be in our method declaration ->  saying this methods amy throw an exception
- throw is keyword -> throwing an exception object -> inside{ }


in the try block

m1() -> m2() -> m3()
when? you have more method calls, and each of them may throw exceptions

in which method its happened(m2)
who called the methods (m1)
the entire history/flow of method calls(main -> m1 -> m2)
-> to know you can use printstack tree()