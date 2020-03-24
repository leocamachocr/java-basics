
# Solving the problem

An example how to solve a problem from a developer perspective tackling the solution from the input to output.


---

## Definition of problem (Requirements)
Structure:
* Hold an infinite list of integers.
* Keeping the insertion order: Add 1, then 2: the list should contain [1,2].
* Figured out what number is next to and what is the previous of a given number.
* List all the numbers contained into the list.
* Remove a number from the list: remove only the numbers matching with the one indicated, the required nodes needs to be collapse.

___

## Defining tasks

It is important to analyze the given information in order to divide the problem in sub-tasks, we can define the list of task based on the requirements

---

## Defining tasks

#### 1. Create a class: A place to hold the completed list. This can be class. Lets use _List_ as name of the class for now.

    * Input: Integers processed asynchronously.
    * Output: List of integers.

#### 2. Add: An entry point to populate elements to the list

    * Input: An integer.
    * Output: List will contain new number at the end of the list.
     
---

## Defining tasks

#### 3. Remove: An entry point to remove elements from the list

    * Input: An integer.
    * Output: List without the given number.

#### 4. Next Of: An entry point to obtain the next number of the given one.

    * Input: An integer.
    * Output: The number after the indicated one.

---

## Defining tasks

#### 5. Previous Of: An entry point to populate elements to the list

    * Input: An integer.
    * Output: The number before the indicated one.

---

### Using UML class Diagram
With the information we have until now, we can create a basic class UML diagram. Without attributes only actions defining inputs and outputs

![UML Diagram](https://drive.google.com/uc?export=view&id=1Kegq-CR58Y3qTJbIO-3Me7GUoUezJXmN)

---

### Definition of Priorities
1. Define structure
2. Add
3. Remove
4. NextOf
5. PreviousOf
6. Print

---

### 1. Define structure
````java
interface List{ 
     void add(Integer value);
     void remove(Integer value);
     Integer nextOf(Integer value);
     Integer previousOf(Integer value);
     String print();
}
````

---

### 1. Define structure
![List Node Example](https://drive.google.com/uc?export=view&id=1KSg3w10dZCNSV2aIYXlcbAeOhSCU6G_e)
---

### 1. Define structure

````java
class Node{
    private Integer value;
    private Node next;
    private Node previous;
    Node(Integer value){this.value=value;}
    //Assuming sets and gets are generated
}
````

---

TODO display uml diagram with node and class

---

### 2. Add
Listing scenarios
1. Adding a number when list is empty.
2. Adding a number when list is contains a number.
3. Adding null number.

---

### 2. Add: Adding a number when list is empty
````java
class ListImpl{
    Node node;
    void add(Integer value){
        Node node = new Node(value);
        this.node=node;
    }
}
````

---

### 2. Add: Adding a number when list is contains a number

Redefining method to accomplish the scenarios

````java
class ListImpl{
    Node node;
    void add(Integer value){
        Node node = new Node(value);
        if(node==null){//first scenario
            this.node=node;
        }else{//second scenario
           node.setPrevious(this.node);
           this.node.next=node;
        }
    }
}
````

---

### 2. Add: Adding null number.

Redefining method to accomplish the scenarios

````java
class ListImpl{
    Node node;
    void add(Integer value){
        if(value==null)return;//third scenario
        Node node = new Node(value);
        if(node==null){//first scenario
            this.node=node;
        }else{//second scenario
           node.setPrevious(this.node);
           this.node.next=node;
        }
    }
}
````

---

### 2. Remove
Listing scenarios
1. Remove record at some middle position.
2. Remove record at the last position.
3. Remove record at the first position.
4. Remove null value.
5. Remove non existing record.

---

### 2. Remove: Remove record at some middle position.

````java
class ListImpl{
    Node node;
    void remove(Integer value){
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)){
                current.getNext().setPrevious(current.getPrevious());//first scenario
                current.getPrevious().setNext(current.getNext());
            }
        }

    }
}
````

---


### 2. Remove: Remove record at the last position.

````java
class ListImpl{
    Node node;
    void remove(Integer value){
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)) {
                if(current.getNext()!=null){
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                    current.getPrevious().setNext(null);
            
                }
            }
        }

    }
}
````

---

### 2. Remove: Remove record at the first position.

````java
class ListImpl{
    Node node;
    void remove(Integer value){
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)) {
                if(current.getNext()!=null){
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                    current.getPrevious().setNext(null);
                }else if(current.getNext()!=null && current.getPrevious()==null ){//second scenario
                    current.getNext().setPrevious(null);
                    node=current.getNext();//Move reference for first node
                }
            }
        }

    }
}
````

---

### 2. Remove: Remove null value.

````java
class ListImpl{
    Node node;
    void remove(Integer value){
        if(value==null)return;//fourth scenario
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)) {
                if(current.getNext()!=null){
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                    current.getPrevious().setNext(null);
                }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                    current.getNext().setPrevious(null);
                    node=current.getNext();//Move reference for first node
                }
            }
        }

    }
}
````

---
### 2. Remove: Remove non existing record.

Redefining structure to define an scenario
````java
class ListImpl{
    Node node;
    boolean remove(Integer value){
        if(value==null)return;//fourth scenario
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)) {
                if(current.getNext()!=null){
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                    current.getPrevious().setNext(null);
                }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                    current.getNext().setPrevious(null);
                    node=current.getNext();//Move reference for first node
                }
                return true;//fifth scenario
            }
        }
        return false;//fifth scenario
    }
}
````

---
### 2. Remove: Analize code to identify missing scenarios

Redefining structure to define an scenario
````java
class ListImpl{
    Node node;
    boolean remove(Integer value){
        if(value==null)return;//fourth scenario
        Node current=node;
        while(current!=null){
            if(current.value.equals(value)) {
                if(current.getNext()!=null){
                    current.getNext().setPrevious(current.getPrevious());//first scenario
                    current.getPrevious().setNext(current.getNext());
                }else if(current.getNext()==null && current.getPrevious()!=null ){//second scenario
                    current.getPrevious().setNext(null);
                }else if(current.getNext()!=null && current.getPrevious()==null ){//third scenario
                    current.getNext().setPrevious(null);
                    node=current.getNext();//Move reference for first node
                }else{//sixth scenario: list only have one node
                    node=null;
                }
                return true;//fifth scenario
            }
        }
        return false;//fifth scenario
    }
}
````

---



### 3. Next Of
Listing scenarios
1. Get next of last record.
1. Get next of first record.
2. Get next of middle record.
4. Get next of non existing record.
5. Get next of null value.

---

### 4. Previous Of
Listing scenarios
1. Get previous of last record.
1. Get previous of first record.
2. Get previous of middle record.
4. Get previous of non existing record.
5. Get previous of null value.

---

### 5. Print
Listing scenarios
1. Get previous of last record.
1. Get previous of first record.
2. Get previous of middle record.
4. Get previous of non existing record.
5. Get previous of null value.


    