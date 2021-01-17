# Homework 1

This is the assignment given for the included code, basically all code
signatures and methods (including interfaces) were given, but the body of the code I wrote

## Problem 1

Define a `Rectangle` class (in `Rectangle.java`) that implements `RectangleInterface`. In addition, you should implement the `Comparable` interface, such that `Rectangle` objects can be compared by their **perimeter**. That is, your class signature should be:
```
public class Rectangle implements RectangleInterface, Comparable<Rectangle>
```


## Problem 2 

Write a `GenericMethods` class (in `GenericMethods.java`) that implements `GenericMethodsInterface`.

There are two methods you must implement:

* `linearSearch`: Iterate through the array linearly and search for a value equal (again, in the `Comparable` sense) to `x`. This must run in O(n) time. If the value is not found in the array, return -1. Else, return the index in the array where the value was found.
* `binarySearch`: Implement a **recursive** binary search to find a value equal to `x`. Hint: The public `binarySearch` method, itself, should not be recursive. The private helper method should be. This private helper method with additional parameters should be called from the public `binarySearch` method. This must run in O(log n) time. If the value is not found in the array, return -1. Else, return the index in the array where the value was found.

 
## Problem 3

In a file called `BigO.java`, implement `BigOInterface` and write methods that have the following runtime requirements:

- `cubic` must be O(n^3)
- `exp` must be O(2^n)
- `constant` must be O(1)

Where n is an integer which is passed into the function. The methods can contain any code fragments of your choice. However, in order to receive any credit, the runtime requirements must be satisfied. As in the previous two problems, you must implement the interface to receive full credit.

In addition to writing the code fragments, we will explore their actual runtimes, to observe big-O in action in the real world. In a file called `Problem3.java` write a `main` method which runs the code with various values of `n` and measures their runtime. Then, discuss the results you observed briefly in a file called `Problem3.txt`.

To properly time code runtime in Java, we must disable compiler optimizations. We do this by running the code with the `-Xint` flag, for example: `java -Xint Problem3`. The easiest way to time your run is to wrap each fragment with the following code:

```
long startTime = System.nanoTime();
// YOUR CODE HERE
long endTime = System.nanoTime();
```

The elapsed time is the difference between these two variables.

Note also that you may see slightly erratic results due to noise and memory allocation delays. This may be one of the factors you discuss in addressing outliers.
