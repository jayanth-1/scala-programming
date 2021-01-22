Functional Programming Principles in Scala
    
    Hello World
    Evaluation Strategies
    Conditionals
    Tail Recursion
    Higher Order functions
    Anonymous Functions
    Currying
    Operator Precedence
    Polymorphism
    Pattern Matching
    Collections

Scala

Highly scalabale language
Type safe
50% reduction of code compared to java
It eliminates boiler plate code.
Avoids mutations.

Some key features of scala
    
    Type inference
    Lazy computation
    Singleton object
    Rich collection set
    Higher order function
    Pattern matching
    require(expression, message) is used as a precondition statement
    Constructor can be overloaded by using this(...) method
    Immutability

Differences from java

Classes

Classes in scala are similiar to classes in java, but here don't have static members in classes. You can use objects to acheive same functionality as with static members in java.

Traits

Traits are like interfaces in java but it can also method implementation.

Objects

Objects are like classes in java. There is only one single instance. It is not possible to create instances of objects. We can access fields or methods by object name.

Evaluation Strategies
Call by value
It first evalutes the arguments and then execution of function takes place

Call by name
First function execution takes place and then evalutes the arguments whenever it access.

Scala generally uses call by value. Call by value is exponentially efficient than call by name, because it avoids recomputaion of expressions.

Tail Recursion

If a function call itself as its last action, the function's stack frame can be reused. It's called tail recursion.There is no need to keep record of the previous state.
Tail recursive functions are iterative process
Interest of tail recursion is mostly to avoid very deep recursive chains
Most instance of JVM, limit the maximal depth of recursion to couple of thousand stack frames. If input data is such that these deep recursive chains could happen. In that case it's a good idea to reformulate function into tail recursive to avoid stackoverflow exception

Higher Order functions

Like any other value, a function can be passed as a parameter and returned as a result
Functions that take other functions as parameters or that return functions as results are called higher order functions.
It provides a flexible way to compose programs. Basically it helpful to write clean and maintainable code.

Anonymous Functions

Passing functions as parameters leads to creation of many small functions.Sometimes it is tedious to have to define these functions using def.
Compare to strings, we don't need to define a string using def, because strings exist as literals. Similarly we would like function literals,
which let us write a function without giving it a name. These are called anonymous functions.

Currying

Currying is the process of converting a function with multiple arguments into a sequence of functions that take one argument. Each function returns another function that consumes the following argument.

Operator Precedence

    (all letters)
    |
    ^
    &
    < >
    = !
    :
    + -
    * / %
    (all other special characters)
    a + b ^? c ?^ d less a ==> b | c to ((a + b) ^?( c ?^ d)) less ((a ==> b) | c)


Polymorphism

Polymorphism means that a function type comes "in many forms"
In programming it means function can be applied to arguments of many types
Two principle forms of polymorphism

    subtyping: instance of a subclass can be passed to a base class
    generics: instances of a function or class are created by type paramaterization

Pattern Matching

Pattern matching is a generalization of switch from C/Java to class hierarchies
Patterns are constructed from:
  -> constructors e.g. Number, sum
  -> variables e.g. n, e1, e2
  -> wildcard patterns _,
  -> constants, e.g. 1,true

Collections

    Lists
    Maps
Both are immutable

Scala's immutable collections are:

    easy to use: few steps to do the job
    concise: one word replaces a whole loop
    safe: type checker is really good at catching errors
    fast: collection ops are tuned, can be parallelized
    universal: one vocabulary to work on all kinds of collections


Functional Program Design in Scala

Maps are also functions from keys to values

Partial functions:
isDefinedAt guarantee that partial function gives you only applies to the outermost The most matching block, it's not a guarantee that if a function is defined at an argument that this function definitely will not throw a match error when it is run because the match error could be thrown

Collection Methods:

All collection types share a common set of general methods
Core methods:
map
flatMap
filter

and also
foldLeft
foldRight


Monads
Data structures with map and flatMap seem to be quite common
In fact there is a name that describes this class of a data structures together with some algebraic laws that they should have. They are called monads.
