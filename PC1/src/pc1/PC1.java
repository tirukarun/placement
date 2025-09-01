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
public class PC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] arr = {"P1", "P2", "P3", "P4"};
        String[] newArr = new String[arr.length+1];
        int max = arr.length-1;
        int pos = 1;
        String value = "PE";
        int insertIndex = pos-1;
        
        for(int i=0; i<arr.length; i++)
        {
            newArr[i] = arr[i];
        }
        
        for(int i=max; i>=insertIndex; i--)
        {
            newArr[i+1] = newArr[i];
        }
        newArr[insertIndex] = value;
        
        for(int i=0; i<newArr.length; i++)
        {
            System.out.println(newArr[i]);
        }
    }
    
}
