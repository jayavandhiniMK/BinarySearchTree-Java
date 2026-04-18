#  Binary Search Tree (Java)

This project is a complete implementation of a **Binary Search Tree (BST)** in Java. It demonstrates core tree operations along with different traversal techniques and view-based algorithms.

---

##  Features

###  Tree Operations

* Insert nodes into BST
* Delete a node from BST
* Search for a specific value
* Find minimum and maximum values

### Traversals

* Inorder Traversal
* Preorder Traversal
* Postorder Traversal
* Level Order Traversal (BFS)

###  Tree Views

* Top View
* Left View
* Right View

### Additional Functionality

* Count total leaf nodes

---

## Technologies Used

* Java
* Data Structures (Binary Search Tree)
* Collections Framework (Queue, TreeMap)

---

## Project Structure

Tree.java
├── Node class
├── Insert, Delete, Search methods
├── Traversal methods
├── View methods
└── Main method (user input & execution)

---

## How to Run

1. Compile the program:

   ```bash
   javac Tree.java
   ```

2. Run the program:

   ```bash
   java tree
   ```

3. Provide input:

   * First value → Root node
   * Enter values continuously
   * Enter `-1` to stop input

---

##  Example Input

```
10 5 15 3 7 12 18 -1
```

---

## Sample Output

```
Inorder: 
3 5 7 10 12 15 18

Pre-order:
10 5 3 7 15 12 18

Post-order:
3 7 5 12 18 15 10

Level-order:
10 5 15 3 7 12 18
```

---

## Note

* The tree follows Binary Search Tree properties:

  * Left child < Parent
  * Right child > Parent
* Ensure proper input format to avoid runtime errors.

---

## Learning Outcomes

* Understanding of BST operations
* Tree traversal techniques
* Breadth-First Search (BFS)
* Use of Java Collections in real problems

---

## Future Improvements

* Add balancing (AVL / Red-Black Tree)
* GUI visualization of tree
* Unit testing

---

## Author

Jayavandhini M K

B.Tech Information Technology

---
