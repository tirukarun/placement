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
public class BinarySearch {
    
    public void start()
    {
        int[] arr = new int[10000000]; //{10,20,30,40,50,60,70,80,90,100};
        int targetValue = 100;
        int targetIndex = search(arr, targetValue);
        System.out.println("Target Index = " + targetIndex);
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
}
