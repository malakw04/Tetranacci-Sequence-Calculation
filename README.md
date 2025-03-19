# Tetranacci Sequence Calculation

## Overview
This project implements multiple methods to compute the **Tetranacci sequence** using different recursive techniques in Java. The Tetranacci sequence is defined similarly to the Fibonacci sequence, but each term is the sum of the previous four terms:

\[ T(n) = T(n-1) + T(n-2) + T(n-3) + T(n-4) \]

The program calculates the Tetranacci number for values from **5 to 200** (increments of 5) using three different approaches:
1. **Linear Recursion** - Uses an iterative approach with an array. (*TetraLin.java*)
2. **Multiple Recursion** - Uses naive recursion with exponential time complexity. (*TetraMult.java*)
3. **Tail Recursion** - Uses an optimized recursive approach with reduced stack overhead. (*TetraTail.java*)

The execution time for each approach is measured and stored in separate output files.

## File Structure
```
├── TetraLin.java   # Computes Tetranacci using linear recursion
├── TetraMult.java  # Computes Tetranacci using multiple recursion
├── TetraTail.java  # Computes Tetranacci using tail recursion
```

## Requirements
- **Java 8 or later** must be installed.

## Compilation and Execution
### 1. Compile the Java files
```bash
javac TetraLin.java TetraMult.java TetraTail.java
```

### 2. Run the programs
Each program generates results in its corresponding output file.
```bash
java TetraLin
java TetraMult
java TetraTail
```

## Output
Each program writes results to a separate text file:
- `TetraOutLin.txt` (Linear recursion results)
- `TetraOutMult.txt` (Multiple recursion results)
- `TetraOutTail.txt` (Tail recursion results)

Each line in the file follows the format:
```
Tetranacci(n) = <computed_value> (Execution Time: <time>ms)
```

## Performance Analysis
- **Linear recursion** is the most efficient as it avoids redundant calculations.
- **Multiple recursion** is extremely slow for large `n` due to exponential growth.
- **Tail recursion** optimizes recursive calls by reducing stack overhead.

## Contributions
Feel free to fork this repository and submit pull requests for improvements.
