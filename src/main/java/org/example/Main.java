package org.example;
/* Task 2:
* Write Implementation of ArrayList (without using Java ArrayList ready library), you can use java simple arrays, it stores Integer type of data and you have to write 3 methods: add, add at some index, delete at some index, get at some index.
2.1) Think about complexity of methods for: add, delete, get by index ( O(?) )
* */
public class Main {
    public static void main(String[] args) {

        TaskArrayList array = new TaskArrayList();

        array.printArray();
        array.addToArray();
        array.getFromArrayAtIndex();
        array.addToArrayAtIndex();
        array.deleteFromArrayAtIndex();
    }
}