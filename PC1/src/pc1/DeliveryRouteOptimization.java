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
public class DeliveryRouteOptimization {
    
    public void start()
    {
        int[] ar = {210, 215, 220, 225, 230};
        int[] deletedArr = deletion(ar, 2);
        int[] insertionVal = {235, 205};
        int[] afterInserted = insertion(deletedArr, insertionVal);
        sort(afterInserted);
        System.out.println(Arrays.toString(afterInserted));
    }
    
    private int[] deletion(int[] arr, int index)
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
    
    private int[] insertion(int[] arr, int[] value)
    {
        int[] newArray = new int[arr.length + value.length];
        
        for(int i=0; i<arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        
        for(int i=0; i<value.length; i++)
        {
            newArray[arr.length + i] = value[i];
        }
        
        return newArray;
    }
    
    private void sort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;        
                }
            }
        }
    }
}
