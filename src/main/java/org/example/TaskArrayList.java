package org.example;

import java.util.Arrays;

public class TaskArrayList {

    public void printArray(int [] array1) {
        System.out.println("Array before manipulations: " + Arrays.toString(array1));
    }

    public int[] addToArray(int [] array1, int number1){
        int [] arrayAdded = new int[array1.length + 1];
        System.out.println("Array1: " + Arrays.toString(array1));
        for(int i = 0; i < array1.length; i++){
            arrayAdded[i] = array1[i];
        }
        arrayAdded[array1.length] = number1;
        System.out.println("Array after adding: " + Arrays.toString(arrayAdded));
        return arrayAdded;
    }

    public int [] addToArrayAtIndex(int [] array1, int index, int number1){
        int i = 0;
        int [] arrayAdded = new int[array1.length + 1];
        while(i != index){
            arrayAdded[i] = array1[i];
            i++;
        }
        arrayAdded[index] = number1;

        i = index + 1;
        while(i < arrayAdded.length){
            arrayAdded[i] = array1[i-1];
            i++;
        }
        System.out.println("Array after adding at index: " + Arrays.toString(arrayAdded));
        return arrayAdded;
    }

    public int getFromArrayAtIndex(int [] array1, int index){
        int searchedNumber = 0;
        for(int i = 0; i < array1.length; i++){
            if(i == index) {
                searchedNumber = array1[i];
                System.out.println("Item found: " + array1[i]);
                return searchedNumber;
            }
        }
        return searchedNumber;
    }

    public int [] deleteFromArrayAtIndex(int [] array1, int index){
        int [] arrayDeleted = new int[array1.length -1];
        int i = 0;
        while(i < index){
            arrayDeleted[i] = array1[i];
            i++;
        }

        i = index + 1;
        while (i < array1.length){
            arrayDeleted[i - 1] = array1[i];
            i++;
        }
        System.out.println("Array after deleting at index: " + Arrays.toString(arrayDeleted));
        return arrayDeleted;
    }
}