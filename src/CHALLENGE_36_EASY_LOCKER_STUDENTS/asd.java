/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_36_EASY_LOCKER_STUDENTS;

/**
 *
 * @author adam
 */
public class asd {
    
public static void main (String[]args)
{
    lockerProblem();
}
public static void lockerProblem()
{
        boolean lockers [] = new boolean[1001];
        
        for(int i = 0 ; i < 1001 ; i++)
            lockers[i] = false;
        
        for(int i = 1 ; i < 1001 ; i++)
            for(int j = i ; j < 1001; j+=i)
                lockers[j] = !lockers[j];
        
        int openlockers = 0;
        for(int i = 1 ; i < 1001 ; i++)
            if(lockers[i])
            {
                openlockers++;
                System.out.print(i + ", " + (openlockers % 5 == 0 ? "\n" : ""));
            }
    System.out.println("\ntotal open = " + openlockers);
}
}