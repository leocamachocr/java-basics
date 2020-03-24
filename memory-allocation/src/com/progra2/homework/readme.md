

# Solving the problem

An example how to solve a problem from a developer perspective tackling the solution from the input to output.


---

### Definition of problem (Requirements)
We want to have a structure to:
* Hold an infinite list of integers.
* Keeping the insertion order: Add 1, then 2: the list should contain [1,2].
* Figured out what number is next to and what is the previous of a given number.
* List all the numbers contained into the list.
* Remove a number from the list: remove only the numbers matching with the one indicated, the 
nodes need to be collapse.

___

### Defining tasks

It is important to analyze the given information in order to divide the problem in sub-tasks, 
we can define the list of task based on the requirements

---

#### 1. Create a class: A place to hold the completed list. This can be class. Lets use _List_ as name of the class for now.

    * Input: Integers processed asynchronously.
    * Output: List of integers.

#### 2. Add: An entry point to populate elements to the list

    * Input: An integer.
    * Output: List will contain new number at the end of the list.
     
---

#### 3. Remove: An entry point to remove elements from the list

    * Input: An integer.
    * Output: List without the given number.

#### 4. Next Of: An entry point to obtain the next number of the given one.

    * Input: An integer.
    * Output: The number after the indicated one.

#### 5. Previous Of: An entry point to populate elements to the list

    * Input: An integer.
    * Output: The number before the indicated one.

---

### Using UML class Diagram
With the information we have until now, we can create a basic class UML diagram. Without attributes only actions defining inputs and outputs

![UML Diagram](https://drive.google.com/uc?export=view&id=1nYFmzFhnHJqGcTDacCTXMlc2ZdzJIMr5)

---

### Definition of Priorities
* Define structure
* Add
* Remove
* NextOf
* PreviousOf
* Print

---

### Design
* Print: Iterate over the list 

    
---

### Diagram the problem
![List Node Example](https://drive.google.com/uc?export=view&id=1WzwQkRfmhxB3TjrtcV2d4nzESSA6O7wA)

---
