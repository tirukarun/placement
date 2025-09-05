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
public class RollerCoaster {
    
    public void start()
    {
        int[] queue = {501, 502, 503, 504, 505};
        int canceledTicket = 503;
        int vip = 999;
        int bouncer = 777;
        
        int canceledTicketIndex = 
                linearSearch(queue, canceledTicket);
        System.out.println(canceledTicketIndex);
        
        int[] deletedArr = deletion(queue, canceledTicketIndex);
        System.out.println(Arrays.toString(deletedArr));
        
        int[] vipInsertArr = 
                insertion(deletedArr, vip, canceledTicketIndex);
        System.out.println(Arrays.toString(vipInsertArr));
        
        int[] firstBouncerArr = 
                insertion(vipInsertArr, bouncer, canceledTicketIndex);
        System.out.println(Arrays.toString(firstBouncerArr));
        
        int[] secondBouncerInsert = 
                insertion(firstBouncerArr, bouncer, canceledTicketIndex+2);
        System.out.println(Arrays.toString(secondBouncerInsert));
        
    }
    
    private int linearSearch(int[] arr, int targetValue)
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
    
    private int[] insertion(int[] arr, int value, int index)
    {
        int[] newArray = new int[arr.length+1];
        
        for(int i=0; i<index; i++)
        {
            newArray[i] = arr[i];
        }
        
        for(int i=arr.length-1; i>=index; i--)
        {
            newArray[i+1] = arr[i];
        }
        newArray[index] = value;
        return newArray;
    }
}
