/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_40_EASY_PRINTING_ARRAY_WITHOUT_LOOPS;

/**
 *
 * @author adam
 */
public class Easy40 {
    public static int n = 0;
    public static int[] array = new int[1000];   
    public static void print() {
        try {
            System.out.println(n+=1+array[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.exit(0);
        }
        print();
    }
    public static void main(String[] args) {
        Easy40.print();
    }
}