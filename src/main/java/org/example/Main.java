package org.example;
/* Task 2:
* Write Implementation of ArrayList (without using Java ArrayList ready library), you can use java simple arrays, it stores Integer type of data and you have to write 3 methods: add, add at some index, delete at some index, get at some index.
2.1) Think about complexity of methods for: add, delete, get by index ( O(?) )
* */
public class Main {
    public static void main(String[] args) {

        TaskArrayList array = new TaskArrayList();

        int[] array1 = {1, 5, 9, 14};

        array.printArray(array1);
        array.addToArray(array1, 5);
        array.getFromArrayAtIndex(array1, 1);
        array.addToArrayAtIndex(array1, 0, 8);
        array.deleteFromArrayAtIndex(array1, 2);
    }
}