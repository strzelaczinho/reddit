/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_39_EASY_FIZZBUZZ;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String[]args)
    {
        runme(20);
    }
    public static void runme(int n){

int num = n;
for (int i = 1; i<=num; i++)
{if (i % 3==0 && i % 5 == 0)
{
   System.out.println("FizzBuzz");
}
    
else if (i % 3 == 0) 
{   
System.out.println("Fizz");
}
else if (i % 5 == 0)
{
   System.out.println("Buzz");
}
else  
{
    System.out.println(i);
}

}
}
}
