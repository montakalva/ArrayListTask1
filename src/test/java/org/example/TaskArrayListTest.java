package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskArrayListTest {

    @Test
    public void arrayLengthIncreasedByOneAfterAddingNumber(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {2, 33, 15, 99, 44};
        int [] arrayAfterAdding = taskArrayList.addToArray(array1, 8);
        Assertions.assertNotEquals(array1.length, arrayAfterAdding.length);
    }

    @Test
    public void arrayContainsAddedValue(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {2, 33, 15, 99, 44};
        int [] arrayAfterAdding = taskArrayList.addToArray(array1, 777);
        int numberToTest = 777;
        for (int i = 0; i < array1.length; i++){
               int numberAdded = arrayAfterAdding[arrayAfterAdding.length - 1];
               Assertions.assertEquals(numberAdded, numberToTest);
        }
    }

    @Test
    public void arrayLengthIncreasedByOneAfterAddingNumberAtIndex(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {17, 3, 89, 20};
        int [] arrayAfterAdding = taskArrayList.addToArrayAtIndex(array1, 1, 1);
        Assertions.assertNotEquals(array1.length, arrayAfterAdding.length);
    }

    @Test
    public void arrayContainsAddedValueAtIndex(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {2, 33, 15, 99, 44};
        int index = 0;
        int numberToTest = 777;
        int [] arrayAfterAdding = taskArrayList.addToArrayAtIndex(array1, 0,777);
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            if(count == index){
                int currentNumber = arrayAfterAdding[i];
                Assertions.assertEquals(numberToTest, currentNumber);
            }
            count++;
        }
    }

    @Test
    public void arrayContainsNecessaryAmountOfNumbers(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {10, 20, 30,40};
        int index = 3;
        taskArrayList.getFromArrayAtIndex(array1, index);
        Assertions.assertTrue(array1.length > index);
    }

    @Test
    public void foundRequestedValueInArrayAtIndex(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {2, 33, 15};
        int index = 0;
        int foundNumber = taskArrayList.getFromArrayAtIndex(array1, index);
        int numberToFound = 2;
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            if(count == index){
                Assertions.assertTrue(foundNumber == array1[i] && foundNumber == numberToFound);
            }
            count++;
        }
    }

    @Test
    public void arrayLengthShortenedByOneAfterAddingNumber(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {5, 10, 20, 30, 50};
        int index = 3;

        int [] arrayAfterDeleting = taskArrayList.deleteFromArrayAtIndex(array1, index);
        Assertions.assertTrue(array1.length > arrayAfterDeleting.length);
    }

    @Test
    public void arrayAfterDeletingAtIndexDoesNotContainIndexValueAtIndex(){
        TaskArrayList taskArrayList = new TaskArrayList();

        int [] array1 = {10, 10, 30, 40, 50};
        int index = 0;
        int numberToTest = 10;

        int [] arrayAfterDeleting = taskArrayList.deleteFromArrayAtIndex(array1, index);

        if(array1[index] != array1[index+1]){
            Assertions.assertTrue(arrayAfterDeleting[index] != numberToTest);
        } else {
            Assertions.assertTrue(arrayAfterDeleting[index + 1] != numberToTest);
        }
    }
}