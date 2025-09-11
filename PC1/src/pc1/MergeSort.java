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
public class MergeSort {
    
    public void sort()
    {
        int[] arr = {35, 60, 7, 125, 95, 12, 56, 55};
        int[] sortedArr = divide(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    
    private int[] divide(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        
        int mid = arr.length/2;
        
        int[] leftArr = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = divide(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(leftArr, rightArr);
    }
    
    private int[] merge(int[] leftArr, int[] rightArr)
    {
        int i=0;
        int j=0;
        
        int[] newArr = new int[leftArr.length + rightArr.length];
        int k=0;
        
        while(i<leftArr.length && j<rightArr.length)
        {
            if(leftArr[i] < rightArr[j])
            {
                newArr[k] = leftArr[i];
                i++;
                k++;
            } else if(rightArr[j] < leftArr[i])
            {
                newArr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        
        while(i<leftArr.length)
        {
            newArr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while(j<rightArr.length)
        {
            newArr[k] = rightArr[j];
            j++;
            k++;
        }
        return newArr;
    }
}
