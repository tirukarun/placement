/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc1;

import java.util.Arrays;

/**
 *
 * @author tiruk
 */
public class ArrayDeletion {
    
    public void start()
    {
        int[] arr = {1001, 1002, 1003, 1004, 1005};
        int removalIndex = 2;
        
        int[] part1Arr = deleteElement(arr, removalIndex);
        System.out.println("Part-1: " + Arrays.toString(part1Arr));
        
        int insertIndex = arr.length-1;
        int[] part2Arr = insertElement(part1Arr, insertIndex, 1006);
        System.out.println("Part-2: " + Arrays.toString(part2Arr));
    }
    
    private int[] deleteElement(int[] arr, int index)
    {
        int[] newArr = new int[arr.length-1];
        for(int i=0, j=0; i<arr.length; i++)
        {
            if(i != index)
            {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
    
    private int[] insertElement(int[] arr, int index, int value)
    {
        int[] newArr = new int[arr.length+1];
        
        for(int i=0; i<index; i++)
        {
            newArr[i] = arr[i];
        }
        
        for(int i=arr.length-1; i>index; i--)
        {
            newArr[i+1] = arr[i];
        }
        
        newArr[index] = value;
        
        return newArr;
    }
}
