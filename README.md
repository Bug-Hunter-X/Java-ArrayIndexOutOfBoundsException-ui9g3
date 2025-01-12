# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains code that attempts to access an array element outside the valid index range. The `bugSolution.java` file shows how to fix the error by ensuring array access is within bounds.

## Bug Description

The bug occurs because the code attempts to assign a value to an array index that doesn't exist.  Arrays in Java are zero-indexed, meaning the first element is at index 0.  If an array has size 5, the valid indices are 0, 1, 2, 3, and 4.  Attempting to access index 5 or higher will result in an `ArrayIndexOutOfBoundsException`. 

## Solution

The solution involves checking the array index before accessing it.  A common practice is to use a `try-catch` block to handle the exception gracefully, or to ensure the index is within the bounds of the array before the access occurs.