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
public class dsa
{
public static boolean [] Lockers(){
    boolean [] lockers = new boolean[1000];
    for(int i=0;i<lockers.length;i++){
        lockers[i]=false;
    }
    for(int i=1;i<=lockers.length;i++){
        for(int j=0;j<lockers.length;j++){
            int exp =i*j;
            if(exp<lockers.length){
                lockers[exp] =!lockers[exp];
            }
            else{
                j=lockers.length;
            }
        }
    }
    for(int i=0;i<lockers.length;i++){
        if(lockers[i]){
         System.out.println(i);   
        }
    }
    return lockers;
 }
public static void main (String[]args)
{
    Lockers();
}
}