package org.example;

import java.util.Arrays;

public class TaskArrayList {

    int[] array1 = {1, 5, 9, 14};
    int [] arrayAdd = new int[array1.length + 1];
    int [] arrayDeleted = new int[array1.length -1];
    int number1 = 20;
    int index = 3;

    public void printArray() {
        System.out.println("Array before manipulations: " + Arrays.toString(array1));
    }

    public void addToArray(){
        for(int i = 0; i < array1.length; i++){
            arrayAdd[i] = array1[i];
        }
        arrayAdd[array1.length] = number1;
        System.out.println("Array after adding: " + Arrays.toString(arrayAdd));
    }

    public void addToArrayAtIndex(){
        int i = 0;
        while(i != index){
            arrayAdd[i] = array1[i];
            i++;
        }
        arrayAdd[index] = number1;

        i = index + 1;
        while(i < arrayAdd.length){
            arrayAdd[i] = array1[i-1];
            i++;
        }
        System.out.println("Array after adding at index: " + Arrays.toString(arrayAdd));
    }

    public void getFromArrayAtIndex(){
        for(int i = 0; i < array1.length; i++){
            if(i == index) System.out.println("Item found: " + array1[i]);
        }
    }

    public void deleteFromArrayAtIndex(){
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
    }
}