/*
Write a program that takes a list of integers and a target number and determines 
if any two integers in the list sum to the target number. If so, return the two numbers. 
If not, return an indication that no such integers exist.


*/
package CHALLENGE_30_EASY_SUM_OF_INTEGERS;

import java.util.HashSet;
import java.util.Random;

public  class sum{
public static int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19};




public static boolean sprawdz (int[] lista,Random rand)
{       
        boolean b = false;
        HashSet ab = new HashSet();
        int  a = rand.nextInt(list.length);
        System.out.println("Szukana suma to "+a);
        
          
        for ( int i = 0 ;i < lista.length;i++)
        for (int  j = 0;j<lista.length;j++)
        {
            if (lista[i]+lista[j]== a )
            {
                System.out.println("Znaleziono sume "+lista[i]+" "+lista[j]+" = "+a);
                b = true;
            }
          
        }
      
    return b;
    
}


public static void main(String[] args)
        
{
	Random rand = new Random();
	boolean c = sprawdz(list,rand);
        System.out.println(c);
}
}