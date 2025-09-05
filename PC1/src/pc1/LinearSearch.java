/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc1;

/**
 *
 * @author tiruk
 */
public class LinearSearch {
    
    public void start()
    {
        int[] arr = {25, 35, 36, 12, 15, 56};
        int targetValue = 12;
        
        int index = search(arr, targetValue);
        
        if(index != -1)
        {
            System.out.println("Target Value present in the index: " 
                    + index);
        } else {
            System.out.println("Sorry no value found.");
        }
    }
    
    private int search(int[] arr, int targetValue)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==targetValue)
            {
                return i;
            }
        }
        return -1;
    }
}
