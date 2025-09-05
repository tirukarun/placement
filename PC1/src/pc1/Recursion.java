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
public class Recursion {
    
    public void printName(String name, int i)
    {
        if(i<5)
        {
            System.out.println(i + ". " + name);
            printName(name, ++i);
        }
    }
    
    public int factorial(int number)
    {
        if(number == 1)
        {
            return 1;
        }
        int total = factorial(number-1) * number;
        return total;
    }
    
}
