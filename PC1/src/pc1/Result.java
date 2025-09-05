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
public class Result {
    
    public void start()
    {
        int[] resultList = 
        {1001, 1005, 1010, 1012, 1015, 1020, 1030};
        
        int friend1ROllNumber = 1012;
        int friend1Index = 
                binarySearch(resultList, friend1ROllNumber);
        
        int friend2RollNumber = 1011;
        int friend2Index = 
                binarySearch(resultList, friend2RollNumber);
        
        if(friend1Index != -1)
        {
            System.out.println("Friend 1 is passed");
        } else {
            System.out.println("Friend 1 is failed");
        }
        
        if(friend2Index != -1)
        {
            System.out.println("Friend 2 is passed");
        } else {
            System.out.println("Friend 2 is failed");
        }
    }
    
    private int binarySearch(int[] arr, int targetValue)
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
