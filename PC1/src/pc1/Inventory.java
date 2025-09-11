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
public class Inventory {
    
    public void start()
    {
        int[] arr = {501, 502, 503, 504, 505};
        int index = search(arr, 503);
        int[] deletedArr = deletion(arr, index);
        int[] newVal = {506, 500};
        int[] insertedArr = insertion(deletedArr, newVal);
        sort(insertedArr);;
        System.out.println(Arrays.toString(insertedArr));
    }
    
    private int search(int[] arr, int targetValue)
    {
        int left = 0;
        int right = arr.length-1;
        int count = 0;
        
        while(left <= right) 
        {
            count++;
            System.out.println("count = " + count);
            int mid = (left + right)/2;

            if(arr[mid] == targetValue)
            {
                return mid;
            } else if(arr[mid] < targetValue)
            {
                left = mid+1;
            } else if(arr[mid] > targetValue)
            {
                right = mid-1;
            }
        }
        return -1;
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
