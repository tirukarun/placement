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
public class BubbleSort {
    
    public void sort()
    {
        int[] arr = {55, 102, 78, 34, 89};
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;        
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
